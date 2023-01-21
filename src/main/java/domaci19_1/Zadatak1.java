package domaci19_1;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Tetrapak jedan = new Tetrapak("05050","Sok Jabuka",1,2,true,100);
        jedan.tezinaPakovanja();
        jedan.cenaArtikla();
        jedan.stampaj();
        System.out.println();

        StaklenaAmbalaza dva = new StaklenaAmbalaza("1010101", "Mleko", 2, 4, 20,
                true, 205);
        dva.cenaArtikla();
        dva.stampaj();
        System.out.println();

        Korpa korpa = new Korpa();
        korpa.dodajU(jedan);
        korpa.dodajU(dva);

        korpa.izbaciIz("1010101");




    }
}
