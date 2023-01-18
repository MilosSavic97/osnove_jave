package domaci17_1;

public class TimeControl extends Control{
    private boolean pojacajSmanji;

    public TimeControl(boolean pojacajSmanji) {
        this.pojacajSmanji = pojacajSmanji;
    }

    public boolean isPojacajSmanji() {
        return pojacajSmanji;
    }

    public void setPojacajSmanji(boolean pojacajSmanji) {
        this.pojacajSmanji = pojacajSmanji;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        if (this.pojacajSmanji==true && (video.getDuzinaVidea()- video.getTrenutnoVremeVidea())>=15){
            video.setTrenutnoVremeVidea(video.getTrenutnoVremeVidea()+15);

        } else if (this.pojacajSmanji==true && (video.getDuzinaVidea()- video.getTrenutnoVremeVidea())<15) {
            video.setTrenutnoVremeVidea(video.getDuzinaVidea());

        } else if (this.pojacajSmanji==false) {
            video.setTrenutnoVremeVidea(video.getTrenutnoVremeVidea()-15);

        } else if (this.pojacajSmanji==false && (video.getTrenutnoVremeVidea()<15)) {
            video.setTrenutnoVremeVidea(0);

        }
    }
}
