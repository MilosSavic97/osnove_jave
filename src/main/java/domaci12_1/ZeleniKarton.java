package domaci12_1;

public class ZeleniKarton {
    private String imePrezimeStud;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProf;
    private int ocena;

    public ZeleniKarton(String imePrezimeStud, String brojIndeksa, String nazivPredmeta, String imePrezimeProf, int ocena) {
        this.imePrezimeStud = imePrezimeStud;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProf = imePrezimeProf;
        this.ocena = ocena;
    }

    public String getImePrezimeStud() {
        return imePrezimeStud;
    }

    public void setImePrezimeStud(String imePrezimeStud) {
        this.imePrezimeStud = imePrezimeStud;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImePrezimeProf() {
        return imePrezimeProf;
    }

    public void setImePrezimeProf(String imePrezimeProf) {
        this.imePrezimeProf = imePrezimeProf;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: "+ this.imePrezimeStud + ", "+this.brojIndeksa);
        System.out.println("Profesor: "  + this.imePrezimeProf);
    }
    public boolean daLiJePolozen(){
        if (this.ocena > 5) {
            return true;
        }else {return false;}
    }
}
