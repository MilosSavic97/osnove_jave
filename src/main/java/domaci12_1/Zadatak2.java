package domaci12_1;

public class Zadatak2 {
    public static void main(String[] args) {
        ZeleniKarton jedan = new ZeleniKarton("Milos Savic",
                "789", "QA Testing", "Milan i Vlada", 10);
        jedan.stampaj();

        jedan.daLiJePolozen();
        System.out.println(jedan.daLiJePolozen());
    }
}
