package playlist;

import java.util.Arrays;
import java.util.Comparator;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs={
                new Song("Title1","Artist1",5),
                new Song("Title2", "Artist2",6),
                new Song("Title3","Artist3",3),
                new Song("Title4","Artist2",9),
                new Song("Title5","Artist1",20),
        };

        Arrays.sort(songs, Comparator
                .comparing(Song::getDuration, Comparator.reverseOrder())
                .thenComparing(Comparator.comparing(Song::getArtist)
                        .thenComparing(Song::getTitle))
        );
        for(Song song : songs){
            System.out.println(song);
        }
    }


}
