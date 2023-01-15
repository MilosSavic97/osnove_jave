package domaci13_1_23;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> listaIspita;

    public ArrayList<Ispit> getListaIspita() {
        return listaIspita;
    }

    public void setListaIspita(ArrayList<Ispit> listaIspita) {
        this.listaIspita = listaIspita;
    }

    public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.listaIspita = new ArrayList<>();
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return listaIspita;
    }

    public void dodajIspit(Ispit ispit){
        this.listaIspita.add(ispit);
    }
    public void prosek(){
        int brojac = 0;
        int zbirBrojaca = 0;
        for (int i = 0; i < this.listaIspita.size(); i++) {
            if (this.listaIspita.get(i).getOcena() > 5){
                brojac ++;
                zbirBrojaca = zbirBrojaca + this.listaIspita.get(i).getOcena();
            }
            double prosek = zbirBrojaca / (brojac);
            System.out.println(prosek);
        }
    }
    public void stampajStudent(){
        System.out.println(this.brojIndeksa + ", "  + this.imeIPrezime + ", "+ this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.listaIspita.size(); i++) {
            System.out.println(this.listaIspita.get(i).getNazivPredmeta()+ ", "+this.listaIspita.get(i).getImeIPrezimeProf()
                    + ", "+ this.listaIspita.get(i).getOcena());

        }


    }

}
