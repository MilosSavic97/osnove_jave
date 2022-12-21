package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak4_19_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*Napisati program koji vodi evidenciju koliko je uneto sledecih
        reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
        Program podrzava sledece reakcije:
        like
        smile
        heart
        */
        System.out.println("Unesite n : ");
        int n = s.nextInt();
        int svidjanja = 0;
        int smajl = 0;
        int srce = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();
            if (reakcija.equals("like")){
                svidjanja = svidjanja + 1;
            } else if (reakcija.equals("smile")) {
                smajl = smajl + 1;
            } else if (reakcija.equals("heart")) {
                srce = srce + 1;
            }
        }
        System.out.println("Summary: like "+ svidjanja + " | smile "+ smajl + " | heart "+srce);



    }
}
