package music;

import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {

    public int compare(Song song1,Song song2)
    {
        int Durationcompare = song1.getDuration()-song2.getDuration();
        return Durationcompare;
    }
}
