package com.dhiren.root.designpatterns.prototype.demo;

public class Movie extends Item {

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", price=" + price +
                '}';
    }
}
