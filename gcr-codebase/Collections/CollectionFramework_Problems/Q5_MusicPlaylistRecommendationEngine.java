import java.util.*;

public class Q5_MusicPlaylistRecommendationEngine {
    static LinkedList<String> recentlyPlayed = new LinkedList<>();
    static final int MAX_SIZE = 10;

    static void playSong(String song) {
        recentlyPlayed.addFirst(song);
        if (recentlyPlayed.size() > MAX_SIZE) {
            String removed = recentlyPlayed.removeLast();
            System.out.println("Removed oldest song: " + removed);
        }
        System.out.println("Now playing: " + song);
    }

    static void searchSong(String song) {
        if (recentlyPlayed.contains(song)) {
            System.out.println(song + " found in recently played.");
        } else {
            System.out.println(song + " not found in recently played.");
        }
    }

    static void displayHistory() {
        System.out.println("Recently Played Songs:");
        for (String song : recentlyPlayed) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        String[] songs = {
            "Kesariya", "Apna Bana Le", "Tum Hi Ho", "Raataan Lambiyan",
            "Chaleya", "Agar Tum Saath Ho", "Ghungroo", "Kal Ho Naa Ho",
            "Zara Zara", "Tera Ban Jaunga", "Ranjha"
        };
        for (String s : songs) {
            playSong(s);
        }

        System.out.println();
        searchSong("Chaleya");
        searchSong("Naina");

        System.out.println();
        displayHistory();
    }
}
