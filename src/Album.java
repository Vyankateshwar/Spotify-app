import java.util.*;
public class Album {
    private String title;
    private String artist;

    private List <Song> songs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }



    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();

    }
    public boolean findsong(String title){
        for(Song x:songs){
            if(x.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public void addSongToAlbum(String name, double duration){
        Song s = new Song (name,duration);
        if(findsong(s.getTitle())){
            System.out.println("This song is already exist !");
        }
        else{
            songs.add(s);
            System.out.println("Song<"+ s.getTitle() + ">is added");
        }
    }
    //polymorfism
    public void addToPlaylistFromAlbum(String title,LinkedList<Song> playlist ){
            if(findsong(title)){
                for(Song x :songs){
                    if(x.getTitle().equals(title)){
                        playlist.add(x);
                        System.out.println("song<"+x.getTitle()+">has been added to your playlist");
                        break;
                    }

                }
            }
            else{
                System.out.println("Song not exist !");
            }
    }
    public void addToPlaylistFromAlbum(int trackNo, LinkedList<Song> playlist){
            int index = trackNo-1;
            if(index>=0 && index <songs.size()){
                playlist.add(songs.get(index));
                System.out.println("song added to your playlist !");
            }
            else{
                System.out.println("invalid track no");
            }
    }

}
