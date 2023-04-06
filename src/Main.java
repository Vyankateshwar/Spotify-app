import java.util.*;
public class Main {
    public static void main(String[] args) {

        Album album1 =new Album("moosa","Sidhu moosewala");
        album1.addSongToAlbum("295",4.5);
        album1.addSongToAlbum("so high",4.8);
        album1.addSongToAlbum("loud voice",8.5);

        Album album2 = new Album("sad song","arjit singh");
        album2.addSongToAlbum("kesariya",6.5);
        album2.addSongToAlbum("gerua",4.5);
        album2.addSongToAlbum("jeena jeena",9.5);

        System.out.println(album2.findsong("295"));
        LinkedList<Song> myplaylist = new LinkedList<>();
        album1.addToPlaylistFromAlbum("295",myplaylist);
        album2.addToPlaylistFromAlbum(2,myplaylist);

    }
}