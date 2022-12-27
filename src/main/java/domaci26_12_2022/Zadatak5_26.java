package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak5_26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String karakter = s.next();
        stampaMetod(n, karakter);

    }
    /*Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/ / / / /
Napomena: Metoda nista ne vraca.

*/public static void stampaMetod(int broj, String kojiZeli) {
        for (int i = 0; i < broj; i++) {
            System.out.print(kojiZeli);

        }

    }
}
