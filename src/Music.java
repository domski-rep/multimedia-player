public class Music extends Track implements Playable {

    public Music(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "Muzyka: " + super.toString();
    }
}
