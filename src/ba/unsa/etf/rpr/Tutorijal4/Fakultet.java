package ba.unsa.etf.rpr.Tutorijal4;

import java.util.ArrayList;
import java.util.Iterator;

public class Fakultet {
    ArrayList<Student> studenti = new ArrayList<Student>();
    ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
    ArrayList<Upis> upisani = new ArrayList<Upis>();

    public Fakultet(ArrayList<Student> studenti, ArrayList<Predmet> predmeti, ArrayList<Upis> upisani) {
        this.studenti.addAll(studenti);
        this.predmeti.addAll(predmeti);
        this.upisani.addAll(upisani);
    }

    public String getUpisaneStudente() {
        String s = "";
        Iterator<Upis> it = upisani.iterator();
        while(it.hasNext())
            s = s + " " + it.next().getStudent();
        return s;
    }

    public String getUpisaneNaPredmetu(Predmet predmet) {
        String s = "";
        if(!predmeti.contains(predmet)) return s;
        Iterator<Upis> it = upisani.iterator();
        int brojac = 1;
        while(it.hasNext())
            if (it.next().getPredmet().getNazivPredmeta().toUpperCase().equals(predmet.getNazivPredmeta().toUpperCase())) {
                s = s + brojac + ". " + it.next().getStudent() + "\n";
                brojac++;
            }
        return s;
    }
    public String getSveStudente(){
        String s = "";
        Iterator it = studenti.iterator();
        int brojac = 1;
        while(it.hasNext()) {
            s = s + brojac + ". " + it.next() + "\n";
            brojac++;
        }
        return s;
    }
    public void ispisiSvePredmete(){
        String s = "";
        String s1;
        Iterator<Predmet> it = predmeti.iterator();
        while(it.hasNext()) {
            if(it.next().isIzborni()) s1 = "(izborni)";
            else s1 = "(obavezni)";
            System.out.println(it.next().getNazivPredmeta() + " " + s1);
        }
    }
    public void ispisiPredmeteUpisanogStudenta(Student st) {
        if(!studenti.contains(st))return;
        Iterator<Upis> it = upisani.iterator();
        while(it.hasNext())
            if (it.next().getStudent().getBrojIndeksa() == st.getBrojIndeksa())
                System.out.print(it.next().getPredmet().getNazivPredmeta() + " ");
        System.out.println("");
    }
   public boolean isUpisan (Student s){
       Iterator<Upis> it = upisani.iterator();
       while(it.hasNext())
           if (it.next().getStudent().getBrojIndeksa() == s.getBrojIndeksa())
               return true;
           return false;
    }
    public void upisiStudentaNaPredmet (Student s, Predmet p){
        Iterator<Upis> it = upisani.iterator();
        while(it.hasNext())
            if(it.next().getStudent() == s && it.next().getPredmet() == p)return;
                if(predmeti.contains(p))
                upisani.add(new Upis(s, p));
                if(!studenti.contains(s)) studenti.add(s);
    }
    public void ispisiStudentaSaPredmeta (Student s, Predmet p){
        Iterator<Upis> it = upisani.iterator();
        while(it.hasNext()){
            if(it.next().getStudent() == s && it.next().getPredmet() == p)
                upisani.remove(upisani.indexOf(it.next()));
        }
    }
}
