package games ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoGame implements Comparable<VideoGame>{
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(VideoGame otherVideogame) {
        return Integer.compare(otherVideogame.getName().length(),this.name.length());
        //gdybym chciał rosnąco musiałbym zacząć compare od this.name
    }

    public static void main(String[] args) {


        List<VideoGame> gamesList = new ArrayList<>();
        gamesList.add(g1);
        gamesList.add(g2);
        gamesList.add(g3);
        gamesList.add(g4);
        Collections.sort(gamesList);//sortowanie do arraylisty


        //posortowana lista
        for (VideoGame game : gamesList){
            System.out.println(game);
        }

    }
}
