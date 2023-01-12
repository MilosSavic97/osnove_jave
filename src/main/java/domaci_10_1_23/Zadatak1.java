package domaci_10_1_23;

public class Zadatak1  {
    public static void main(String[] args) {

        Knjiga prva = new Knjiga(123123, "Idemo na mesec", 1555);
        Knjiga druga = new Knjiga(232323, "Otkrivanje univerzuma", 2001);
        Knjiga treca = new Knjiga(242424, "Sletanje na mesec", 1969);
        Knjiga cetvrta = new Knjiga(29292, "Idemo na more", 2024);

        Autor a = new Autor("Milos", "Savic");
        Autor b = new Autor("Marko", "Kraljevic");

        prva.setAutorKnjige(b);
        druga.setAutorKnjige(a);
        treca.setAutorKnjige(a);
        cetvrta.setAutorKnjige(a);

        prva.stampaj();
        System.out.println();
        druga.stampaj();
        System.out.println();
        treca.stampaj();

    }
}
