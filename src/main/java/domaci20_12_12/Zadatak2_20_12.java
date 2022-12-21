package domaci20_12_12;

import java.util.Scanner;

public class Zadatak2_20_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji ucitava RIMSKE brojeva od korisnika
         i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ.*/

        String kraj = "KRAJ";
        String unetiBroj = "misa";

        while (!unetiBroj.equals(kraj)){

            System.out.println("Unesite rimski broj :");
            unetiBroj = s.next();

            if (unetiBroj.equals("X")){
                System.out.println("Arapski: 10");
            } else if (unetiBroj.equals("C")) {
                System.out.println("Arapski: 100");
            } else if (unetiBroj.equals("D")) {
                System.out.println("Arapski: 500");
            } else if (unetiBroj.equals("M")) {
                System.out.println("Arapski: 1000");
            } else if (unetiBroj.equals("L")) {
                System.out.println("Arapski: 50");
            } else if (unetiBroj.equals("V")) {
                System.out.println("Arapski: 5");
            }  else if (unetiBroj.equals("I")) {
                    System.out.println("Arapski: 1");


    }
}}}
