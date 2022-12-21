package domaci20_12_12;

import java.util.Scanner;
import java.lang.Math;

public class Zadatak1_20_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*Napisati program koji ucitava brojeva od korisnika i za svaki broj
        prikazuje apsolutnu vrednost sve dok se ne unese nula.  */
        int broj = 1;
        while (broj !=0) {
            System.out.println("Unesite broj");
            broj   = s.nextInt();
            System.out.println(Math.abs(broj));


        }



    }



}
