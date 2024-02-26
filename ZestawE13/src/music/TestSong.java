package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[]songs={
                new Song("New Tank","Playboy Carti",240),
                new Song("RIP","Playboy Carti",180),
                new Song("California Love","2pac",240)
        };

        System.out.println("Before Sort:");
        for(Song song : songs){
            System.out.println(song);
        }

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("After Sort:");
        for(Song song : songs){
            System.out.println(song);
        }
    }




}
