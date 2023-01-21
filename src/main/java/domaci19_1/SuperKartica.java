package domaci19_1;

public class SuperKartica {
    private String brojKartice;
    private String imePrezime;
    private int popustDin;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imePrezime, int popustDin) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popustDin = popustDin;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getPopustDin() {
        return popustDin;
    }

    public void setPopustDin(int popustDin) {
        this.popustDin = popustDin;
    }
    public void stampaj(){
        System.out.println("( " + this.imePrezime + " ) ( " + this.brojKartice+ " ) ");
    }


}
