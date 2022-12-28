package domaci27_12;

public class Proizvod_z1 {

    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaUgramima;

    public void stamajPoruku(){
        System.out.print("{{" + this.nazivProizvoda + "}}, "+"{{" + this.cenaProizvoda + "}}, "
        + "{{" + this.tezinaUgramima + "}}, ");

    }
    public double tezinaKon(String x){
        double tezina = 0;
        if (x.equals("kg")){
            tezina = this.tezinaUgramima/1000;
            return tezina;
        } else if (x.equals("t")) {
            tezina = tezinaUgramima / 1000000;
            return tezina;
        }return 0;

    }
}
