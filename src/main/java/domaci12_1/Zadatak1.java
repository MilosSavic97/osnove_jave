package domaci12_1;

public class Zadatak1  {
    public static void main(String[] args) {
        Racun prvi = new Racun("170-155-100", "Milos Savic", 25000);
        Racun drugi = new Racun("170-200-399", "Marko Kraljevic", 50000);

        prvi.stampajRacun();
        prvi.promeniStanje(2500);
        prvi.stampajRacun();
        drugi.promeniStanje(-5000);
        drugi.stampajRacun();

        Transakcija jedan = new Transakcija(25, prvi, drugi);
        jedan.transakcija(3000);
        prvi.stampajRacun();
        drugi.stampajRacun();
        jedan.stampajTransakciju();
        prvi.stampajRacun();
        drugi.stampajRacun();



    }
}
