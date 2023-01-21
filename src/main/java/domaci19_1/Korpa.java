package domaci19_1;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> lista;

    public ArrayList<Ambalaza> getLista() {
        return lista;
    }

    public Korpa() {
        this.lista = new ArrayList<>();
    }

    public void setLista(ArrayList<Ambalaza> lista) {
        this.lista = lista;
    }

    public void dodajU (Ambalaza stavka){
        this.lista.add(stavka);
    }
    public void izbaciIz(String barkod){
        for (int i = 0; i < lista.size(); i++) {
            if (barkod == lista.get(i).getBarkod()){
                this.lista.remove(i);
            }}}
    private double cenaSaPopustom(int popust){
        double cenaPopust= 0;
        for (int i = 0; i < lista.size(); i++) {
            cenaPopust = lista.get(i).cenaArtikla() - popust;
            return cenaPopust;
        }return 0;

    }public double ukupnaCena(SuperKartica kartica){
        double ukupna = 0;
        for (int i = 0; i < lista.size(); i++) {
            ukupna = ukupna+ lista.get(i).cenaArtikla();
        }return ukupna - kartica.getPopustDin();
    }
}
