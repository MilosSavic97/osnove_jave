package domaci20_12_12;
import java.util.Scanner;
public class Zadatak3_20_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji od korisnika ucitava brojeve
        sve dok ne unesu bar dve dvojke ili tri jedinice.
         */
        int brojac2 = 0;
        int brojac1 = 0;
        while (brojac1 < 3 && brojac2 < 2) {
            System.out.println("Unesite broj : ");
            int broj = s.nextInt();
            if (broj == 2){
                brojac2++;
            } else if (broj == 1) {
                brojac1++;
            }
        }



    }
}
