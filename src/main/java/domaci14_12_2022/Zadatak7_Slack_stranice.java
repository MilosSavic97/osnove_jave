package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak7_Slack_stranice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ukupan broj rezultata: ");
        int ukupanBroj = s.nextInt();
        System.out.println("Unesite broj rezultata po strani: ");
        int brojPoStrani = s.nextInt();
        System.out.println("Unesite stranu");
        int zeljeniBrojStrane = s.nextInt();

          if (zeljeniBrojStrane > (ukupanBroj/brojPoStrani) && (ukupanBroj%brojPoStrani == 0)) {
            System.out.println("No results for page " + zeljeniBrojStrane);
        } else if (zeljeniBrojStrane > (ukupanBroj/brojPoStrani) && (ukupanBroj%brojPoStrani > 0)) {
              System.out.println("Showing "+ (ukupanBroj-(ukupanBroj%brojPoStrani)+1 + " to " + ukupanBroj + " entries"));
        } else {
            System.out.println("Showing " + ((zeljeniBrojStrane*brojPoStrani)-brojPoStrani + 1) + " to "+ (zeljeniBrojStrane*brojPoStrani)+ " of "+ ukupanBroj + " entries"  );

        }


    }
}
