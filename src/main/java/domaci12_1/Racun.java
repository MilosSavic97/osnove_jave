package domaci12_1;

public class Racun {
    private String brojRacuna;
    private String imePrezime;
    private int trenutnoStanje;

    public Racun(String brojRacuna, String imePrezime, int trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void setTrenutnoStanje(int trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public void promeniStanje (int promena){
        this.trenutnoStanje = trenutnoStanje + promena;
    }

    public void stampajRacun(){
        System.out.println(this.imePrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: "+ this.trenutnoStanje);
    }
}
