package domaci19_1;

public class Tetrapak extends Ambalaza{
    private boolean reciklirajuce;
    private int osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina,
                    int brutoTezina, boolean reciklirajuce, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklirajuce = reciklirajuce;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean reciklirajuce, int osnovnaCena) {
        this.reciklirajuce = reciklirajuce;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklirajuce() {
        return reciklirajuce;
    }

    public void setReciklirajuce(boolean reciklirajuce) {
        this.reciklirajuce = reciklirajuce;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        double cenaArtikla = 0;
        if (this.reciklirajuce==true){
            cenaArtikla = tezinaPakovanja() * 1.5 + this.osnovnaCena;
            return cenaArtikla;
        } else if (this.reciklirajuce==false) {
            cenaArtikla= this.osnovnaCena;
            return cenaArtikla;
        }return 0;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv: "+this.nazivArtikla+" , Barkod :"+ this.barkod +" , Neto tezina : " +this.netoTezina
                +" ,  Bruto tezina: " +this.brutoTezina);
        System.out.println(" Reciklirajuce : " + this.reciklirajuce);
        System.out.println(" Osnovna cena : " + this.osnovnaCena + " , Cena: "+ this.cenaArtikla());

    }
}
