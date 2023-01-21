package domaci19_1;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean daLiKaucija;
    private int osnovnaCena;

    public double getKaucija() {
        return kaucija;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla,
                            double netoTezina, double brutoTezina, double kaucija, boolean daLiKaucija, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiKaucija = daLiKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiKaucija() {
        return daLiKaucija;
    }

    public void setDaLiKaucija(boolean daLiKaucija) {
        this.daLiKaucija = daLiKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        double cenaArtikla=0;
        if (this.daLiKaucija==true){
        cenaArtikla = this.osnovnaCena * 1.2 + this.kaucija;
        return cenaArtikla;
        } else if (this.daLiKaucija==false) {
            cenaArtikla = this.osnovnaCena * 1.2;
            return cenaArtikla;
        }return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv: "+this.nazivArtikla+" , Barkod :"+ this.barkod +" , Neto tezina : " +this.netoTezina
                +" ,  Bruto tezina: " +this.brutoTezina);
        System.out.println(" Kaucija : " + this.kaucija);
        System.out.println(" Osnovna cena : " + this.osnovnaCena + " , Cena: "+ this.cenaArtikla());
    }


}
