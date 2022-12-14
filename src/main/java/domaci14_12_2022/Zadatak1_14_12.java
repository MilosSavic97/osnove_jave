package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak1_14_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji ima informacije koje ucitava informacije sa tastature:
Ime
Prezime
godinu rodjenja
I stampa informaicije u formatu:
[ime] [prezime] - [startost] god
*/
        System.out.println("Unesite vase ime: ");
        String ime = s.next();

        System.out.println("Unesite vase prezime: ");
        String prezime = s.next();

        System.out.println("Unesite vase godine: ");
        String starost = s.next();

        System.out.println(ime+ " " + prezime + " - " + starost + " god");


    }
}
