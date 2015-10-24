package com.matthew.cataloguer.data;

import java.util.HashMap;

/**
 * Created by Jack T on 10/24/2015.
 */
public class Collection {
    private HashMap<String,Discography> artists;

    Collection(){
        artists = new HashMap<String, Discography>();
    }

    public int getSize(){
        int size = 0;
        for (String artist : artists.keySet()) {
            size += artists.get(artist).getSize();
        }

        return size;
    }

    public Discography getDiscography(String artistName){
        return artists.get(artistName);
    }

}
