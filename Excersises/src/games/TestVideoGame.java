package games;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestVideoGame {
    public static void main(String[] args) {

        VideoGame g1 = new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt", 9.5F);
        VideoGame g2 =new VideoGame("Grand Theft Auto V", "Rockstar Games", 9.0F);
        VideoGame g3 = new VideoGame("Red Dead Redemption 2", "Rockstar Games", 9.8F);
        VideoGame g4 = new VideoGame("Assassin's Creed Valhalla", "Ubisoft", 8.7F);

        ArrayList<VideoGame>videoGames=new ArrayList<>();
        videoGames.add(g1);
        videoGames.add(g2);
        videoGames.add(g3);
        videoGames.add(g4);

        Collections.sort(videoGames);

        for(VideoGame game : videoGames){
            System.out.println(game);
        }





    }
}
