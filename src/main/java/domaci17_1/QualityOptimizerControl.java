package domaci17_1;

public class QualityOptimizerControl extends Control{
    private int brzinaNeta;

    public QualityOptimizerControl(int brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    public int getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(int brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        if (this.brzinaNeta * 10.1 <241){
            video.setKvalitetVidea(240);
        } else if (this.brzinaNeta * 10.1 >240 && this.brzinaNeta * 10.1 < 721) {
            video.setKvalitetVidea(720);
        }else if (this.brzinaNeta * 10.1>720 && this.brzinaNeta * 10.1 < 1081){
            video.setKvalitetVidea(1080);
        }

    }
}
