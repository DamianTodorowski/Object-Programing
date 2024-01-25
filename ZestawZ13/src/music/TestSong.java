package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("New Tank", "Playboy Carti", 4),
                new Song("One dance", "Drake", 4),
                new Song("Don't like ", "Chief Keef", 5),
                new Song("California Love", "2pac", 3)
        };

        Arrays.sort(songs,new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for (Song song:songs){
            System.out.println(song);
        }
    }
}
