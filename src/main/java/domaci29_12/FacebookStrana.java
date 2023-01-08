package domaci29_12;

public class FacebookStrana {
    public static void main(String[] args) {
        FacebookPost user = new FacebookPost();
        user.setImePrezimeO("Milos Savic");
        user.setImePrezimeP("Marko Kraljevic");
        user.setTekst("De si kralju sta ima?!");
        user.stapmanje();
        user.povecajLajk();
        user.povecajLajk();
        user.share();
        user.stapmanje();

    }
}
