package ba.unsa.etf.rpr.Tutorijal4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlanStudija {
private Map<Integer, Set<Predmet>> planStudija = new HashMap<>();

    public PlanStudija(Map<Integer, Set<Predmet>> planStudija) {
        for(Map.Entry<Integer, Set<Predmet>> par : planStudija.entrySet())
        this.planStudija.put(par.getKey(), par.getValue());
    }
    public void ispisiPredmeteUSemestru(int brojSemestra){
        String s = "Predmeti u " + brojSemestra + " su: ";
        for(Map.Entry<Integer, Set<Predmet>> par : planStudija.entrySet())
            if(par.getKey() == brojSemestra){
                s = s + par.getValue().toString() + " ";
            }
            System.out.println(s);
    }
}
