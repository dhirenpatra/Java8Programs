package com.dhiren.root.designpatterns.prototype.test;

import com.dhiren.root.designpatterns.prototype.common.Movie;

public class Bollywood implements Cloneable{

    private String title;
    private String actor;
    private String actoress;

    private Movie movie;

    public Bollywood(String title, String actor, String actoress, Movie movie) {
        this.title = title;
        this.actor = actor;
        this.actoress = actoress;
        this.movie = movie;
    }

    @Override
    public Bollywood clone() {
        try {
            return (Bollywood) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public String getActress() {
        return actoress;
    }

    public Movie getMovie() {
        return movie;
    }
}
