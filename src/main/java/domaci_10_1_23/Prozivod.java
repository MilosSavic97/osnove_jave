package domaci_10_1_23;

public class Prozivod {
    private String nazivProzivoda;
    private int cenaIzrade;
    private Kupac kupio;

    public Kupac getKupio() {
        return kupio;
    }

    public void setKupio(Kupac kupio) {
        this.kupio = kupio;
    }

    public Prozivod(String nazivProzivoda, int cenaIzrade) {
        this.nazivProzivoda = nazivProzivoda;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNazivProzivoda() {
        return nazivProzivoda;
    }

    public void setNazivProzivoda(String nazivProzivoda) {
        this.nazivProzivoda = nazivProzivoda;
    }
    public int getCenaIzrade() {
        return cenaIzrade;
    }
    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
    public double cenaProzivoda(){
        double cenaProzivoda = this.cenaIzrade * 1.9 * (100 - this.kupio.getClanskaKarta().getPopust()) / 100;
        return cenaProzivoda;
    }
    public void stampaj1(){
        System.out.println(this.nazivProzivoda + "  - " + this.cenaProzivoda());
        System.out.println(this.kupio.getImePrezime() + this.kupio.getClanskaKarta().getBrojKartice());
    }


}
