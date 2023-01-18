package domaci16_1;

import java.util.ArrayList;

public class IgracK extends OsobaK{
    private String brojDresa;
    private String pozicija;
    private ArrayList<Karton> nizKartona;
    private boolean kapiten;

    public IgracK(String imePrezime, String jmbg, int godinaRodjenja) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.nizKartona = new ArrayList<>();
    }

    public IgracK(String imePrezime, String jmbg, int godinaRodjenja, String brojDresa, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.nizKartona = new ArrayList<>();
        this.kapiten = kapiten;
    }

    public ArrayList<Karton> getNizKartona() {
        return nizKartona;
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
    public void dodajKarton(Karton karton){
        this.nizKartona.add(karton);
    }
    public int brojZutihKartona(){
        int brojac = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (nizKartona.get(i).getTipKartona().equals("zuti")){
                brojac++;
            }
        }return brojac;
    }

}
