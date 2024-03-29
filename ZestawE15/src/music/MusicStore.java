package music;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private String city;
    private ArrayList<String>albums;

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = new ArrayList<>();
        if (albums != null) {
            this.albums = new ArrayList<>(albums);
        } else {
            this.albums = new ArrayList<>();
        }

    }
    public void addAlbum(String album){
        albums.add(album);
    }

    public void removeAlbum(String album){
        albums.remove(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getAlbums() {
        return new ArrayList<>(albums);
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = new ArrayList<>();
        if (albums != null) {
            this.albums = new ArrayList<>(albums);
        } else {
            this.albums = new ArrayList<>();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicStore that = (MusicStore) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(city, that.city)) return false;
        return Objects.equals(albums, that.albums);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (albums != null ? albums.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "name='" + name +
                ", city=" + city +
                ", albums=" + albums;

    }
}
