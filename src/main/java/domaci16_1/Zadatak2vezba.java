package domaci16_1;

public class Zadatak2vezba {
    public static void main(String[] args) {
        IgracK prvi = new IgracK("Milos Savic", "2525", 1997,
                                "25", "Napad", true);

        Karton zuti = new Karton("Zuti");
        Karton crveni = new Karton("crveni");

        prvi.dodajKarton(zuti);
        prvi.dodajKarton(zuti);
        prvi.dodajKarton(crveni);

        prvi.brojZutihKartona();
        System.out.println(prvi);

    }

}
