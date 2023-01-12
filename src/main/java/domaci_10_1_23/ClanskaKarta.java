package domaci_10_1_23;

public class ClanskaKarta {
    private int popust;
    private int brojKartice;

    public ClanskaKarta(int popust, int brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }
}
