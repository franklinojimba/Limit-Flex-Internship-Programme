package files.UdemyLessons.NestedClasses;

import java.util.LinkedList;
import java.util.Objects;

public record Song(String title, double duration) {


    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Album album = new Album("Greatest Hits", "John Doe");

        album.addSong("Song One", 3.45);
        album.addSong("Song Two", 4.20);
        album.addSong("Song Three", 5.10);

        LinkedList<Song> playList = new LinkedList<>();
        album.addToPlayList(1, playList);
        album.addToPlayList("Song Two", playList);
        album.addToPlayList(5, playList); // Invalid track

        System.out.println("Playlist:");
        for (Song song : playList) {
            System.out.println(song);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Double.compare(duration, song.duration) == 0 && Objects.equals(title, song.title);
    }

    @Override
    public String toString() {
        return "Song: " + title + ", duration: " + duration + "mins";
    }
}
