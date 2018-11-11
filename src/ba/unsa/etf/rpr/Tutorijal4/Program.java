package ba.unsa.etf.rpr.Tutorijal4;

import java.util.ArrayList;

public class Program {
    public static void main (String[] args){
        ArrayList<Student> studenti = new ArrayList<Student>();
        ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
        Student s1 = new Student ("Ivan", "Maticevic", 1492);
        Student s2 = new Student ("Igor", "Roki", 89123);
        Student s3 = new Student ("Ana", "Anic", 2345);
        Student s4 = new Student ("Renato", "Radic", 2132);
        Student s5 = new Student ("Mujo", "Mjic", 7696);
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);
        studenti.add(s5);
        Predmet p1 = new Predmet ("RPR", 13, true);
        Predmet p2 = new Predmet ("SIS", 10, false);
        Predmet p3 = new Predmet ("EMJ", 12, false);
        Predmet p4 = new Predmet ("PLS", 10, false);
        predmeti.add(p1);
        predmeti.add(p2);
        predmeti.add(p3);
        predmeti.add(p4);
        ArrayList<Upis> upisani = new ArrayList<Upis>();
        Fakultet ETF = new Fakultet(studenti, predmeti, upisani);
        ETF.upisiStudentaNaPredmet(s1,p1);
        ETF.upisiStudentaNaPredmet(s5, p1);
        ETF.upisiStudentaNaPredmet(s2,p4);
        ETF.upisiStudentaNaPredmet(s3,p2);
        ETF.upisiStudentaNaPredmet(s1,p2);
        ETF.ispisiSvePredmete();
        System.out.println(ETF.getUpisaneStudente());
        ETF.ispisiPredmeteUpisanogStudenta(s1);
        ETF.ispisiStudentaSaPredmeta(s1,p1);
        ETF.ispisiPredmeteUpisanogStudenta(s1);
        System.out.println(ETF.getUpisaneStudente());
    }
}
