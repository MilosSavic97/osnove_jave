package domaci17_1;

public class AudioControl extends Control{

    private boolean pojacajSmanjiZvuk;

    public AudioControl(boolean pojacajSmanjiZvuk) {
        this.pojacajSmanjiZvuk = pojacajSmanjiZvuk;
    }

    public boolean isPojacajSmanjiZvuk() {
        return pojacajSmanjiZvuk;
    }

    public void setPojacajSmanjiZvuk(boolean pojacajSmanjiZvuk) {
        this.pojacajSmanjiZvuk = pojacajSmanjiZvuk;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        if (pojacajSmanjiZvuk==true && video.getJacinaZvuka()<101){
            video.setJacinaZvuka(video.getJacinaZvuka()+1);
        } else if (pojacajSmanjiZvuk==false && video.getJacinaZvuka()>0) {
            video.setJacinaZvuka(video.getJacinaZvuka()-1);

        }

    }
}
