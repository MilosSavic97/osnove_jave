package domaci_10_1_23;

public class Zadatak2 {
    public static void main(String[] args) {
        Prozivod prvi = new Prozivod("Mleko", 45);
        Prozivod drugi = new Prozivod("Ulje", 200);

        Kupac jedan = new Kupac("Milos Savic");
        Kupac dva = new Kupac ("Marko Kraljevic");

        ClanskaKarta ein = new ClanskaKarta(5, 25);
        ClanskaKarta zwei = new ClanskaKarta(10, 35);

        prvi.setKupio(jedan);
        drugi.setKupio(dva);
        jedan.setClanskaKarta(ein);
        dva.setClanskaKarta(zwei);
        prvi.stampaj1();
        jedan.stampajKupac();
        dva.stampajKupac();
        prvi.cenaProzivoda();
        System.out.println(prvi.cenaProzivoda());
        System.out.println(drugi.cenaProzivoda());

    }
}
