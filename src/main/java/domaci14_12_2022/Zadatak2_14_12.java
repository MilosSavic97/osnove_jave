package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak2_14_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

/* Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
b=1, vrednost promenljive a se uvecava za 10
b=2, vrednost promenljive a se smanjuje za 20
Na kraju zadatka odstampati novu vrednost promenljive a.
	Primer izvrsenja:
	Unesite a: 44
	Unesite b: 2
	Nova vrednost za a je 24
*/
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();

                if (b == 1){
                     a = a + 10;
                } else if ( b == 2) {
                a = a - 20;
                }
                 else if (b > 2 || b < 1) {
                    System.out.println("Uneli ste pogresan broj, molimo unesite 1 ili 2");
                }
                 else System.out.println("Nova vrednost za a je: "+ a);
}}
