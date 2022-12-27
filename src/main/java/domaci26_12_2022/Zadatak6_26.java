package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak6_26 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int unetiBroj=  s.nextInt();
        String unetaValuta = s.next();
        menjacnica(unetiBroj, unetaValuta);
        System.out.println(menjacnica(unetiBroj, unetaValuta));


    }
/*Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti
konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
Primer poziva funkcija:
Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
Primer izvrsenja main programa:
Unesite vrednost u eurima: 3
Unesite valutu za konverziju: RSD
3 EUR je 351.6339 RSD
Konverzija eura u druge valute:
1 EUR = 117.5 RSD
1 EUR = 1.1 USD
1 EUR = 62.98 RUB
*/
    public static Double menjacnica(int kolicina, String Valuta) {
        if (Valuta.equals("RSD")){
            Double sumaRsd = kolicina * 117.5;
            return sumaRsd;
        } else if (Valuta.equals("USD")) {
            Double sumaUsd = kolicina * 1.1;
            return sumaUsd;
        } else if (Valuta.equals("RUB")) {
            Double sumaRub= kolicina * 62.89;
            return sumaRub;
        }

       return null; }
}
