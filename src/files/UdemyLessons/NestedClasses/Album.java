package files.UdemyLessons.NestedClasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new SongList();
    }

    String name;
    String artist;
    SongList songs;
    static class SongList{
        private final ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }
        private void add(Song song){
            if (songs.contains(song)){
                return;
            }
            songs.add(song);
        }
        private Song findSong(String title) {
            for (Song checkedSong : songs) {
                if (checkedSong.title().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songs.size())) { // fixed bug
                return songs.get(index);
            }
            return null;
        }
    }

public void addSong(String title, double duration){
    songs.add(new Song(title, duration));
}
    public void addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return;
        }
        System.out.println("The song: " + title + " is not in the album");
    }
    public void addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null){
            playList.add(checkedSong);
            return;
        }
        System.out.println("The song: " + trackNumber + " is not in the album");
    }
}

