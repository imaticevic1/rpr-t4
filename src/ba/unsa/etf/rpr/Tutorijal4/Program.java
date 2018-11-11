package ba.unsa.etf.rpr.Tutorijal4;

import java.util.ArrayList;

public class Program {
    public static void main (String[] args){
        ArrayList<Student> st = new ArrayList<Student>();
        
        Student s1 = new Student ("Ivan", "Maticevic", 1492);
        Student s2 = new Student ("Igor", "Roki", 89123);
        Student s3 = new Student ("Ana", "Anic", 2345);
        Student s4 = new Student ("Renato", "Radic", 2132);
        Student s5 = new Student ("Mujo", "Mujic", 7696);
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        ArrayList<Predmet> pred = new ArrayList<Predmet>();
        Predmet p1 = new Predmet ("RPR", 13, true);
        Predmet p2 = new Predmet ("SIS", 10, false);
        Predmet p3 = new Predmet ("EMJ", 10, false);

        pred.add(p1);
        pred.add(p2);
        pred.add(p3);
        //pred.add(p4);
        ArrayList<Upis> up = new ArrayList<Upis>();
        Fakultet ETF = new Fakultet(st, pred, up);
        System.out.println(ETF.getSveStudente());
        ETF.ispisiSvePredmete();

    }
}
