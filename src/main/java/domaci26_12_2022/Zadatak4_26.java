package domaci26_12_2022;

public class Zadatak4_26{  public static void main(String[] args) {
/*Napisati metodu koja stampa podatke o korisniku u formatu:
JMBG: [jmbg]
Ime: [ime]
Prezime: [prezime]
God. rodjenja: [god]
Aktivan: [true/false]
Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

*/
    korisnik("0500505", "Milos", "Savic", 1234, true);
}
        public static void korisnik(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan)
        {
            System.out.println("JMBG: "+ jmbg);
            System.out.println("Ime:"+ ime);
            System.out.println("Prezime "+ prezime);
            System.out.println("God. Rodjenja: "+ godinaRodjenja);
            System.out.println("Aktivan: " +aktivan);
        }

}
