package domaci16_1;

public class Zadatak1 {
    public static void main(String[] args) {


    Igrac prvi = new Igrac("Milos Savic", "2525", 25, "55","Napad", true);
    Igrac drugi = new Igrac ("Marko Kraljevic", "2545", 1240,"1","Konjica",true);

    Trener jedan = new Trener("Piksi", "4444",1950,15,"Kondicioni");
    Trener dva = new Trener("Hasimoto","78787",1960,10,"Pomocni");
    prvi.stampaj();
    jedan.stampaj();


}}

