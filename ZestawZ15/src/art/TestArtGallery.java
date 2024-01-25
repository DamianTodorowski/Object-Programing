package art;

import java.util.ArrayList;

public class TestArtGallery {




    public static void main(String[] args) {
        ArrayList<String>paintings1=new ArrayList<>();
        paintings1.add("Obraz1");
        paintings1.add("obraz2");
        paintings1.add("obraz3");
        ArtGallery a1 = new ArtGallery("Galeria obrazów","Warszawa",paintings1);
        ContemporaryGallery c1 = new ContemporaryGallery("Galeria Obrazów2","Olsztyn",paintings1,5);
        a1.addPainting("obraz4");
        a1.removePainting("obraz2");
        System.out.println(a1);
        System.out.println(c1);
    }
}
