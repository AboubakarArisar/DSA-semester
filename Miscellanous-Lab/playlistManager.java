import java.util.*;
public class PlaylistManager {
    public class Songs {
        String title;
        String artist;
        double duration;

        public Songs(String title, String artist, double duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

    }

    LinkedList<Songs> songs = new LinkedList<Songs>();

    public void addSong(String title, String artist, double duration) {
        Songs newSong = new Songs(title, artist, duration);
        songs.add(newSong);
        System.out.println("Song added successfully.");
    }

    public void deleteSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).title.equals(title)) {
                songs.remove(i);
                return;
            }
        }
        System.out.println("Song not found.");
    }

    public void displaySongs() {
        System.out.println("-----------Songs-------------");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Title: " + songs.get(i).title);
            System.out.println("Artist: " + songs.get(i).artist);
            System.out.println("Duration: " + songs.get(i).duration);
            System.out.println("-------------------------");
        }
    }
    public double totalDuration(){
        double totalDuration = 0;
        for (int i = 0; i < songs.size(); i++) {
            totalDuration += songs.get(i).duration;
        }
        return totalDuration;
    }

    public static void main(String[] args) {
    PlaylistManager pManager = new PlaylistManager();
    pManager.addSong("Ek nukta", "Abdida Parveen", 10);
    pManager.addSong("Asa Ishq", "Abida Parveen", 13.5);
    pManager.addSong("Sadhe Where", "Abida Parveen", 20);
    pManager.displaySongs();
    System.out.println("Total Duration: " + pManager.totalDuration()+" minutes");

    }
}
