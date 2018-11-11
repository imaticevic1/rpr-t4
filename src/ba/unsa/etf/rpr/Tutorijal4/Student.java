package ba.unsa.etf.rpr.Tutorijal4;

public class Student {

        private String ime, prezime;
        private int brojIndeksa;

        public Student(String ime, String prezime, int brojIndeksa) {
            this.ime = ime;
            this.prezime = prezime;
            this.brojIndeksa = brojIndeksa;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public void setBrojIndeksa(int brojIndeksa) {
            this.brojIndeksa = brojIndeksa;
        }

        public String getIme() {
            return ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public int getBrojIndeksa() {
            return brojIndeksa;
        }
        public String toString(){
            return this.getIme() + " " + this.getPrezime() + " (" + this.getBrojIndeksa() + ")";
        }
    public static void main (String[] args) {
    }

}
