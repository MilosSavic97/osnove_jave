package domaci29_12;

public class FacebookPost {
    private String imePrezimeO;
    private String imePrezimeP;
    private String tekst;
    private int lajkovi;
    private int deljenja;
    public String getImePrezimeO(){
        return this.imePrezimeO;
    }
    public String getImePrezimeP(){
        return this.imePrezimeP;
    }
    public String getTekst(){
        return this.tekst;
    }
    public int getLajkovi(){
        return this.lajkovi;
    }
    public int getDeljenja(){
        return this.deljenja;
    }

    public void setImePrezimeO(String imePrezimeO) {
        this.imePrezimeO = imePrezimeO;
    }

    public void setImePrezimeP(String imePrezimeP) {
        this.imePrezimeP = imePrezimeP;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    public void povecajLajk(){
        this.lajkovi = this.lajkovi + 1;
    }
    public void dislajk(){
        this.lajkovi = this.lajkovi - 1;
    }
    public void share(){
        this.deljenja = this.deljenja + 1;
    }
    public void stapmanje (){
        System.out.println(this.imePrezimeO+ ">>>>>>" +this.imePrezimeP);
        System.out.println(this.tekst);
        System.out.println("Lajkovi: "+ this.lajkovi + " | " + "Shares: " + deljenja);

    }


}
