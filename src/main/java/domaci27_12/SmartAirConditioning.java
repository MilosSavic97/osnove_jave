package domaci27_12;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;

    public void stampanje(){
        System.out.println("Marka klime je :" + this.marka + ". Trenutno je podesena na "+this.temperatura +" stepeni"+
                " i da " + this.mod);
    }

    public boolean daLiJeVeca(int trenutnaTemperatura){
        if (trenutnaTemperatura>this.temperatura){
            return true;
        }else {
            return false;
        }
    }
}
