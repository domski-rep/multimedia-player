import java.util.ArrayList;
import java.util.List;

public class PlayList implements Playable {

    private Mode mode;
    private List<Playable> playList = new ArrayList<>();

    public PlayList() {
        mode = Mode.LOOP;

    }


    public PlayList(Mode mode, Playable... tracks) {

        this.mode = mode;
        for (Playable playable : tracks) {
            playList.add(playable);
        }
    }

    public void play() {

        switch (mode) {
            case SEQUENT:
                sequentialMode();
                break;
            case LOOP:
                loopedMode();
                break;
            case SHUFFLE:
                shuffledMode();
                break;
        }

    }

    private void sequentialMode() {
        for (Playable p : playList) {
            p.play();
        }
    }

    private void loopedMode() {
        while (true) {
            sequentialMode();
        }
    }

    private void shuffledMode() {
        List<Playable> forRandomPlayList = new ArrayList<>(playList);

        int pool = forRandomPlayList.size();

        for (int i = 0; i < playList.size(); i++) {
            int trackIndex = (int) (Math.random() * pool--);
            forRandomPlayList.remove(trackIndex).play();
        }

    }


    public void addToPlayList(Playable playable) {
        playList.add(playable);
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }


}
