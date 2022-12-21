package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak3_19_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* Napisati program koji simulira ponasanje speak loud programa.
       Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
        ako se ne sadrzi, program dostampa na kraju
	    Nakon toga program ispisuje nivo agresivnosti u komunikaciji
	     (u procentima). Svaka uneta rec sa ! utice na agresivnost.
*/
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int brojagr = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst: ");
            String text = s.next();
            if (text.contains("!")){
                brojagr = brojagr + 1;
                System.out.println(text);

            } else {
                System.out.println(text + "!");
    }}
        Double procenat = (brojagr/(n*1.0)*100);
        System.out.println("Nivo agresivnosti je "+ procenat+ "%");



            }

        }



