import java.util.Arrays;

public class MusicPlaylist {

    // Private array - cannot be accessed directly from outside
    private String[] songs;

    // Number of songs currently added
    private int songCount;

    // Constructor
    public MusicPlaylist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    // Add a song
    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full.");
        }
    }

    // Return a COPY of the songs, not the original array
    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    // Read-only count
    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {

        MusicPlaylist p = new MusicPlaylist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        // Get a copy
        String[] copy = p.getSongs();

        System.out.println("Songs before modification:");
        System.out.println(Arrays.toString(p.getSongs()));

        // Modify the returned copy
        copy[0] = "Hacked";

        System.out.println("Modified copy:");
        System.out.println(Arrays.toString(copy));

        System.out.println("Actual playlist:");
        System.out.println(Arrays.toString(p.getSongs()));

        System.out.println("Song count: " + p.getSongCount());
    }
}
