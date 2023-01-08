package domaci29_12;

public class Prozivod {
    private String naziv;
    private double cena;
    private double tezinaGr;

    public void stampaj (){
        System.out.println("{{" + naziv + "}}" + "{{" + cena + "}}" + "{{" + tezinaGr + "}}");
    }

    public double povecajCenu (double povecanje){
        this.cena = this.cena + povecanje;
        return cena;
    }
    public double vratiCenuSaPopustom (double popust){
        this.cena = this.cena - ((this.cena/100)*popust);
        return cena;
    }
    public int racunajPostarinu (){
        int postarina = 0;
        if (this.tezinaGr <101){
            postarina = 200;
        }else if (this.tezinaGr > 100 && this.tezinaGr < 501){
            postarina = 400;
        }else {
            postarina = 1000;
        }
        return postarina;
    }
    public String getNaziv(){
        return this.naziv;
    }
    public double getCena(){
        return this.cena;
    }
    public double getTezinaGr(){
        return this.tezinaGr;
    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
    }
    public void setCena(double cena){
        this.cena=cena;
    }
    public void setTezinaGr(double tezinaGr){
        this.tezinaGr=tezinaGr;
    }
}
