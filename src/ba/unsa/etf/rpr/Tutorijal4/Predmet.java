package ba.unsa.etf.rpr.Tutorijal4;

import org.junit.jupiter.api.Test;

public class Predmet{
        private String nazivPredmeta;
        private final int maksBrojStudenata;
        private boolean izborni;

    public Predmet(String nazivPredmeta, int maksBrojStudenata, boolean izborni) {
        this.nazivPredmeta = nazivPredmeta;
        this.maksBrojStudenata = maksBrojStudenata;
        this.izborni = izborni;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getMaksBrojStudenata() {
        return maksBrojStudenata;
    }

    public boolean isIzborni() {
        return izborni;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        nazivPredmeta = nazivPredmeta;
    }

    public void setIzborni(boolean izborni) {
        this.izborni = izborni;
    }
}
