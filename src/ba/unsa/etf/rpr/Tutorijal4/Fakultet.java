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
        for (Upis u : upisani)
            s = s + " " + u.getStudent();
        return s;
    }

    public String getUpisaneNaPredmetu(Predmet predmet) {
        String s = "";
        if(!predmeti.contains(predmet)) return s;
        int brojac = 1;
        for (Upis u : upisani)
            if (u.getPredmet().getNazivPredmeta().toUpperCase().equals(predmet.getNazivPredmeta().toUpperCase())) {
                s = s + brojac + ". " + u.getStudent() + "\n";
                brojac++;
            }
        return s;
    }
    public String getSveStudente(){
        String s = "";
        int brojac = 1;
        for(Student st: studenti) {
            s = s + brojac + ". " + st + "\n";
            brojac++;
        }
        return s;
    }
    public void ispisiSvePredmete(){
        String s = "";
        String s1;
        for(Predmet pr: predmeti) {
            if(pr.isIzborni()) s1 = "(izborni)";
            else s1 = "(obavezni)";
            System.out.println(pr.getNazivPredmeta() + " " + s1);
        }
    }
    public void ispisiPredmeteUpisanogStudenta(Student st) {
        if(!studenti.contains(st))return;
        for (Upis u : upisani)
            if (u.getStudent().getBrojIndeksa() == st.getBrojIndeksa())
                System.out.print(u.getPredmet().getNazivPredmeta() + " ");
        System.out.println("");
    }
   public boolean isUpisan (Student s){
       for (Upis u : upisani)
           if (u.getStudent().getBrojIndeksa() == s.getBrojIndeksa())
               return true;
           return false;
    }
    public void upisiStudentaNaPredmet (Student s, Predmet p){
        for(Upis u : upisani)
            if(u.getStudent() == s && u.getPredmet() == p)return;

                if(predmeti.contains(p))
                upisani.add(new Upis(s, p));
                if(!studenti.contains(s)) studenti.add(s);
    }
    public void ispisiStudentaSaPredmeta (Student s, Predmet p){
        for(Upis u : upisani){
            if(u.getStudent() == s && u.getPredmet() == p)
                upisani.remove(upisani.indexOf(u));
        }
    }
}
