package domaci16_1;

public class Igrac extends Osoba{
    private String brojDresa;
    private String pozicija;
    private boolean kapiten;
    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, String brojDresa, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }
    public String getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(String brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }


    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj dresa: "+this.brojDresa + "Pozicija "+ this.pozicija + "Kapiten "+ this.kapiten);
    }
}
