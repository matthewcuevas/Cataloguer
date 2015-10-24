package com.matthew.cataloguer.data;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;

public class Discography {
    HashMap<String,Release> releases;
    private int size;
    private String artist;

    public Discography(String artist){
        this.artist = artist;
        size = 0;
        releases = new HashMap<String,Release>();
    }

    public int getSize() {
        return releases.entrySet().size();
    }

    public String getArtist(){
        return artist;
    }

    public Release getRelease(String releaseName){
        return releases.get(releaseName);
    }

    public void addRelease(String releaseName,Release release) {
        releases.put(releaseName,release);
    }









}