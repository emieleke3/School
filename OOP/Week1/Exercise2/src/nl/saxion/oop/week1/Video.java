package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Video {
    private String youtubeId;
    private String title;
    private int views;
    private boolean watched = false;

    public Video(String youtubeId, String title, int views) {
        this.youtubeId = youtubeId;
        this.title = title;
        this.views = views;
    }

    public boolean isWatched() {
        return watched;
    }

    public void watch() {
        watched = true;
    }

    public void toStringWatched() {
        SaxionApp.print(youtubeId + " " + title + " " + views);
        if (isWatched()) {
            SaxionApp.print(" [WATCHED]", Color.green);
        } else {
            SaxionApp.print(" [NOT WATCHED]", Color.red);
        }
    }



}

