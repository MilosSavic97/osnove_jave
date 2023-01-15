package domaci12_1;

public class Transakcija {
    private int idTransakcije;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija(int idTransakcije, Racun posiljalac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private void provizija(int poslataSuma){
        int provizija;
        if (poslataSuma<4500){
            provizija = 45;
        } else if (poslataSuma>4500) {
            provizija = poslataSuma/100;
        }

    }
    public void transakcija(int poslataSuma){
        this.posiljalac.setTrenutnoStanje(this.posiljalac.getTrenutnoStanje() - poslataSuma -45);
        this.primalac.setTrenutnoStanje(this.primalac.getTrenutnoStanje() + poslataSuma);
    }
    public void stampajTransakciju(){
        System.out.println(this.idTransakcije);
        System.out.println("posiljalac: " +this.posiljalac.getImePrezime()+  " " +this.posiljalac.getBrojRacuna());
        System.out.println("primalac: "+ this.primalac.getImePrezime()+" " +this.primalac.getBrojRacuna());
    }
}
