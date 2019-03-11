public class Movie extends Track implements Playable {

    public Movie(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this);
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Film: " + super.toString();
    }
}
