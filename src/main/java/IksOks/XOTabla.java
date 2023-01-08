package IksOks;

public class XOTabla {

    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;

    private String imeX;
    private String imeO;
    private String naPotezu;

    public String getImeX() {
        return this.imeX;
    }
    public String getImeO() {
        return this.imeO;
    }
    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeX(String imeX) {
        this.imeX= imeX;

    }
    public void  setImeO(String imeO) {
        this.imeO= imeO;
    }

    public void pokreniIgru() {
        polje1 = " ";
        polje2 = " ";
        polje3 = " ";
        polje4 = " ";
        polje5 = " ";
        polje6 = " ";
        polje7 = " ";
        polje8 = " ";
        polje9 = " ";
        naPotezu = "X";

    }
    public void stampaj() {
        System.out.println("    " +this.polje1 + " | " + this.polje2 + " | " + this.polje3);
        System.out.println("    " +this.polje4 + " | " + this.polje5 + " | " + this.polje6);
        System.out.println("    " +this.polje7 + " | " + this.polje8 + " | " + this.polje9);
        System.out.println(" Igrac X: " + this.imeX);
        System.out.println(" Igrac O: " + this.imeO);

    }

    public boolean praznoPolje(int izabranoPolje) {
        if (izabranoPolje == 1 && this.polje1.equals(" ")) {
            return true;
        } else if (izabranoPolje == 2 && this.polje2.equals(" ")) {
            return true;
        } else if (izabranoPolje == 3 && this.polje3.equals(" ")) {
            return true;
        } else if (izabranoPolje == 4 && this.polje4.equals(" ")) {
            return true;
        } else if (izabranoPolje == 5 && this.polje5.equals(" ")) {
            return true;
        } else if (izabranoPolje == 6 && this.polje6.equals(" ")) {
            return true;
        } else if (izabranoPolje == 7 && this.polje7.equals(" ")) {
            return true;
        } else if (izabranoPolje == 8 && this.polje8.equals(" ")) {
            return true;
        } else if (izabranoPolje == 9 && this.polje9.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")){
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")) {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int brojPolja) {
        if (brojPolja == 1 && this.naPotezu.equals("X")) {
            this.polje1 = "X";
        } else if ((brojPolja == 2) && (this.naPotezu.equals("X"))) {
            this.polje2 = "X";
        } else if (brojPolja == 3 && (this.naPotezu.equals("X"))) {
            this.polje3 = "X";
        } else if (brojPolja == 4 && (this.naPotezu.equals("X"))) {
            this.polje4 = "X";
        } else if (brojPolja == 5 && (this.naPotezu.equals("X"))) {
            this.polje5 = "X";
        } else if (brojPolja == 6 && (this.naPotezu.equals("X"))) {
            this.polje6 = "X";
        } else if (brojPolja == 7 && (this.naPotezu.equals("X"))) {
            this.polje7 = "X";
        } else if (brojPolja == 8 && (this.naPotezu.equals("X"))) {
            this.polje8 = "X";
        } else if (brojPolja == 9 && (this.naPotezu.equals("X"))) {
            this.polje9 = "X";
        } else if (brojPolja == 1 && this.naPotezu.equals("O")) {
            this.polje1 = "O";
        } else if (brojPolja == 2 && this.naPotezu.equals("O")) {
            this.polje2 = "O";
        } else if (brojPolja == 3 && this.naPotezu.equals("O")) {
            this.polje3 = "O";
        } else if (brojPolja == 4 && this.naPotezu.equals("O")) {
            this.polje4 = "O";
        } else if (brojPolja == 5 && this.naPotezu.equals("O")) {
            this.polje5 = "O";
        } else if (brojPolja == 6 && this.naPotezu.equals("O")) {
            this.polje6 = "O";
        } else if (brojPolja == 7 && this.naPotezu.equals("O")) {
            this.polje7 = "O";
        } else if (brojPolja == 8 && this.naPotezu.equals("O")) {
            this.polje8 = "O";
        } else if (brojPolja == 9 && this.naPotezu.equals("O")) {
            this.polje9 = "O";
        }
    }
    public boolean popunjenaTabla(){
        if (this.polje1.equals(" ") || this.polje2.equals(" ") || this.polje3.equals(" ") || this.polje4.equals(" ") || this.polje5.equals(" ") ||
                this.polje6.equals(" ") || this.polje7.equals(" ") || this.polje8.equals(" ") || this.polje9.equals(" ")){
            return false;
        } else {
            return true;
        }
    }
    public boolean pobednikX (){
        if ((this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) ||
                (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) ||
                (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) ||
                (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) ||
                (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")) ||
                (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) ||
                (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) ||
                (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X"))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pobednikO (){
        if ((this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O")) ||
                (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O")) ||
                (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")) ||
                (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O")) ||
                (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")) ||
                (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O")) ||
                (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O")) ||
                (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O"))) {
            return true;
        } else {
            return false;
        }
    }


    }




