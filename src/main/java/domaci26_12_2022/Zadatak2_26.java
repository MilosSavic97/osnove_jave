package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak2_26 {
    public static void main(String[] args) {
/*Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
Metoda od parametara prima ime i prezime (2 parametra) i vraca
 jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
Primer poziva: Ako se metoda pozvoe za ime=”Milan”
 i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
*/
        Scanner s = new Scanner(System.in);
        String ime = s.next();
        String prezime = s.next();
        spoj(ime, prezime);


    }

    public static String spoj(String ime, String prezime) {
        String spajanje = ime + " " +  prezime;
        return spajanje;

    }

}
