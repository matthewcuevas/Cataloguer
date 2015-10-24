package com.matthew.cataloguer.data;

/**
 * Created by Jack T on 10/24/2015.
 */
public class Release {
    private String artist;
    private String title;

    public Release(String artist, String title){
        this.artist = artist;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String toString(){
        return "\""+title+"\" by " + artist;
    }
}
