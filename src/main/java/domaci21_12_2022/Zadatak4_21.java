package domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4_21 {
    public static void main(String[] args) {
        /*. Napisati program koji ucitava niz A duzine N i broj X.
        Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
         */

        ArrayList <Integer> a = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            a.add(broj);
        }

        System.out.print("Unesite X: ");
        int x = s.nextInt();

        ArrayList <Integer> equal = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == x){
                equal.add(i);
            }
        }

        System.out.print("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: ");
        for (int i = 0; i < equal.size(); i++) {
            System.out.print(equal.get(i) + ", ");

        }
    }}

