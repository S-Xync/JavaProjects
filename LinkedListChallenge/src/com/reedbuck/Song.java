package com.reedbuck;

/**
 * Created by saikumar on 24/7/16 at 1:13 PM.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title+" : "+this.duration;
    }
}
