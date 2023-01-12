package domaci_10_1_23;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta clanskaKarta;

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
    public Kupac (String imePrezime){
    this.imePrezime= imePrezime;

    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void stampajKupac(){
        System.out.println(this.imePrezime + ", "+this.clanskaKarta.getBrojKartice());
    }
}
