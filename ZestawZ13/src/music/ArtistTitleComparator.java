package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song song1, Song song2){
        int astistCompare = song2.getArtist().compareTo(song1.getArtist());
        if(astistCompare==0){
            return song2.getTitle().compareTo(song1.getTitle());
        }
        return astistCompare;
    }
}