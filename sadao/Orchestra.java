package sadao;

import java.util.List;

public class Orchestra {
    private List<Musical> musicals;

    public Orchestra(List<Musical> musicals) {
        this.musicals = musicals;
    }

    public void addMusicants(Musical m) {
        this.musicals.add(m);
    }

    public void play() {
        for (Musical m : musicals) {
            m.play();
        }
    }
}
