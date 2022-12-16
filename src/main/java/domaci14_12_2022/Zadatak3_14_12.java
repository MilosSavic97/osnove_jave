package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak3_14_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji proverava da li je kliknuto u okviru
         login forme za web stranicu.
          Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
          T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
*/
        System.out.print("Unesite x za T1: ");
        int xt1 = s.nextInt();
        System.out.print("Unesite y za T1: ");
        int yt1 = s.nextInt();
        System.out.print("Unesite x za T2: ");
        int xt2 = s.nextInt();
        System.out.print("Unesite y za T2: ");
        int yt2 = s.nextInt();
        System.out.print("Unesite x za M: ");
        int xm = s.nextInt();
        System.out.print("Unesite y za M: ");
        int ym = s.nextInt();

        if ((xm <= xt1 && xm <= xt2) && (ym <= yt1 && ym <= yt2)) {
            System.out.println( "Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto unutar forme");









    }
}}
