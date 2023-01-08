package domaci29_12;

public class Prodavnica {
    public static void main(String[] args) {

        Prozivod mleko = new Prozivod();
        mleko.setNaziv("Mleko");
        mleko.setCena(50);
        mleko.setTezinaGr(150);

        mleko.stampaj();
        mleko.povecajCenu(10);
        mleko.vratiCenuSaPopustom(10);
        mleko.stampaj();


    }
}
