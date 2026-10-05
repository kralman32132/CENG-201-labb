
public class Track {


    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    /
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;
    }

    /
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }


    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }


    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }


    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }


    @Override
    public String toString() {
        return "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]" +
                (isExplicit ? " [EXPLICIT]" : "");
    }
}


public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");


        Track defaultTrack = new Track();
        System.out.println("Default Track: \n" + defaultTrack);


        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("\nTitle-only track:\n" + titleOnlyTrack);


        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("\nTitle + Artist Track:\n" + titleArtistTrack);


        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("\nFull Track (non-explicit):\n" + fullTrack);


        Track invalidDurationTrack = new Track("Broken Clock", "Static Noise", -5, false);
        System.out.println("\nInvalid Duration Test:\n" + invalidDurationTrack);


        Track getterTestTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("\nGetter Test:");
        System.out.println("Title:     " + getterTestTrack.getTitle());
        System.out.println("Artist:    " + getterTestTrack.getArtist());
        System.out.println("