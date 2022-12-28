package domaci27_12;

public class Zadatak2 {
    public static void main(String[] args) {
       /* Kreirati klasu SmartAirConditioning koja ima:
        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        atribut za izabranu temperaturu
        atribut za mod (hladi/greje) - string
        metodu za stampu (proizvoljno)
        metodu koja vraca informaciju da li je napolju veca temperatura
         od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
        */
    SmartAirConditioning prvaKlima = new SmartAirConditioning();
    prvaKlima.marka = "Samsung";
    prvaKlima.temperatura= 21;
    prvaKlima.mod = "hladi";

    SmartAirConditioning drugaKlima = new SmartAirConditioning();
    drugaKlima.marka = "Lg";
    drugaKlima.temperatura = 25;
    drugaKlima.mod = "greje";
    drugaKlima.stampanje();
        System.out.println(drugaKlima.daLiJeVeca(33));


    }


}
