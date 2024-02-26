package playlist;

import java.util.Comparator;

class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {

        int artistComparison = song1.getArtist().compareTo(song2.getArtist());

        if (artistComparison == 0) {
            int titleComparison = song1.getTitle().compareTo(song2.getTitle());
            return (titleComparison == 0) ? 0 : titleComparison;
        } else {
            return artistComparison;
        }
    }
}
