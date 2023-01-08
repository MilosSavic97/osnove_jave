package IksOks;

import java.util.Scanner;

public class XOProgram {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        XOTabla igra = new XOTabla();
        System.out.print("Unesite ime X igraca: ");
        igra.setImeX(s.next());
        System.out.print("Unesite ime O igraca: ");
        igra.setImeO(s.next());
        System.out.println();
        igra.pokreniIgru();

        while (!igra.popunjenaTabla() && !igra.pobednikX() && !igra.pobednikO()){
            igra.stampaj();
            System.out.print(" Igrac  " + igra.getNaPotezu() + " ,unesite broj polja:");
            int polje = s.nextInt();
            System.out.println();
            while (!igra.praznoPolje(polje)){
                System.out.println("Potez nije validan");
                polje = s.nextInt();
            }
            igra.odigrajPotez(polje);
            igra.zameniIgraca();

        }
        if (igra.pobednikX()==true){
            System.out.println("Pobedio je  " + igra.getImeX());
        } else if (igra.pobednikO()==true) {
            System.out.println("Pobedio je  " + igra.getImeO());
        } else if (igra.popunjenaTabla()==true) {
            System.out.println("NERESENO!");

        }


    }
}
