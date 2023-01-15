package domaci13_1_23;

public class Zadatak1 {
    public static void main(String[] args) {
       Student prvi = new Student("795", "Milos Savic", "Osnovne");

        Ispit a = new Ispit("Qa testing", 8, "Milan i Vlada");
        Ispit b = new Ispit("Java", 9, "Marko Kraljevic");

        prvi.dodajIspit(a);
        prvi.dodajIspit(b);
        prvi.prosek();
        a.stampajIspit();
        prvi.stampajStudent();

}}
