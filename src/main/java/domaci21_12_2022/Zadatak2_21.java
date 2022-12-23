package domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2_21 {
    public static void main(String[] args) {
        /*Napisati program koji ucitava N brojeva i smesta ih u niz.
         Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.

         */

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int sumaParnih = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj :");
            int broj = s.nextInt();
            brojevi.add(broj);
            if (broj%2==0){
                sumaParnih++;
            }

        }
        System.out.println("Uneto je " + sumaParnih+ " brojeva");
        System.out.println(brojevi);



    }
}
