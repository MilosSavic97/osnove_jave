package domaci_10_1_23;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autorKnjige;

    public Knjiga(int isbn, String naziv, int godinaIzdanja){
        this.isbn = isbn;
        this.naziv= naziv;
        this.godinaIzdanja=godinaIzdanja;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutorKnjige() {
        return autorKnjige;
    }

    public void setAutorKnjige(Autor autorKnjige) {
        this.autorKnjige = autorKnjige;
    }

    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv+ " - "+this.godinaIzdanja);
        System.out.println(this.autorKnjige.getIme() +", "+ this.autorKnjige.getPrezime());
    }
}
