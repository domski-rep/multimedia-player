public class Main {

    public static void main(String[] args) {

       PlayList list = new PlayList();

       list.addToPlayList(new Music("Rolling Stones, Brown Sugar"));
       list.addToPlayList(new PlayList(Mode.SHUFFLE,
               new Music("Metallica, Unforgiven"),
               new Music ("Smokie, I'll Meet You At Midnight"),
               new Music ("Uriah Heep, Lady In Black"),
               new Music("Deep Purple, Sweet Child In Time"),
               new Music("The Cranberries, Zombie"),
               new Music("Nirvana, In Bloom")));
       list.addToPlayList(new Movie("Casablanca"));
       list.setMode(Mode.SEQUENT);
       list.play();
    }
}
