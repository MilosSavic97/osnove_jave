package domaci27_12;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod_z1 prvi = new Proizvod_z1();
        prvi.nazivProizvoda = "Cokolada";
        prvi.cenaProizvoda = 300;
        prvi.tezinaUgramima = 200;

        Proizvod_z1 drugi = new Proizvod_z1();
        drugi.nazivProizvoda  = "Brasno";
        drugi.cenaProizvoda = 150;
        drugi.tezinaUgramima = 1000;
        drugi.stamajPoruku();
        System.out.println(drugi.tezinaKon("kg"));


    }
}
