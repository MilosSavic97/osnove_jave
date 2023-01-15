package domaci13_1_23;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imeIPrezimeProf;

    public Ispit(String nazivPredmeta, int ocena, String imeIPrezimeProf) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeIPrezimeProf = imeIPrezimeProf;

    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProf() {
        return imeIPrezimeProf;
    }

    public void setImeIPrezimeProf(String imeIPrezimeProf) {
        this.imeIPrezimeProf = imeIPrezimeProf;
    }
    public void stampajPolozen(){
        if (this.ocena > 6){
            System.out.println("Ispit je polozen");
        }else {
            System.out.println("Ispit nije polozen");
    }
    }
    public void stampajIspit(){
        System.out.println(this.nazivPredmeta + " - "+ this.imeIPrezimeProf + this.ocena);
    }
}
