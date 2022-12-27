package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak1_26 {
    public static void main(String[] args) {
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
// prosledjena vrednost za 10 veca.Iz main-a pozvati
// izvrsenje metode za razlicite vrednosti.
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        stampajVrednostZa10Vecu(x);
    }
    public static void stampajVrednostZa10Vecu(int x) {
        System.out.println(x=x+10);

    }

}
