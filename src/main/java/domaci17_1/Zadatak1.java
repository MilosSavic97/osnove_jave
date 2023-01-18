package domaci17_1;

import java.sql.Time;

public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer yt = new VideoPlayer(150,60,40,720);

        yt.stampaj();

        TimeControl premotaj= new TimeControl(true);
        TimeControl vrati = new TimeControl(false);
        premotaj.izvrsiAkciju(yt);
        vrati.izvrsiAkciju(yt);
        vrati.izvrsiAkciju(yt);

        yt.stampaj();

        AudioControl pojacaj = new AudioControl(true);
        AudioControl smanji = new AudioControl(false);

        pojacaj.izvrsiAkciju(yt);
        pojacaj.izvrsiAkciju(yt);
        smanji.izvrsiAkciju(yt);
        smanji.izvrsiAkciju(yt);
        smanji.izvrsiAkciju(yt);

        yt.stampaj();

        QualityOptimizerControl kvalitet = new QualityOptimizerControl(72);
        kvalitet.izvrsiAkciju(yt);

        yt.stampaj();

    }
}
