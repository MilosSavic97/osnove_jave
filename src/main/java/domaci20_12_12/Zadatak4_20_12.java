package domaci20_12_12;

import java.util.Scanner;

public class Zadatak4_20_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji proverava uparenost zagrada. Korisnik unosi
        matematicku formulu sve dok ne unese znak =.
         Korisnik unosi svaki karakter jednacine
          posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
	    Formula koja se koristi u primeru je: (2 * ( 1 + 3))= */
        int leveZagrade = 0;
        int desneZagrade = 0;
        String unos = "kraj programa";

        while (!unos.equals("=")){
            System.out.println("Unos : ");
            unos = s.next();
            if (unos.equals("(")){
                leveZagrade++;
            } else if (unos.equals(")")) {
                desneZagrade++;
            }
        }if (desneZagrade==leveZagrade){
            System.out.println("Zagrade su uparene!");

        }else if (leveZagrade>desneZagrade || leveZagrade<desneZagrade) {
            System.out.println("Zagrade nisu uparene!");

        }


    }
}
