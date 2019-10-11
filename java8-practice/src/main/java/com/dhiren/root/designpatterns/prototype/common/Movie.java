package com.dhiren.root.designpatterns.prototype.common;

public class Movie {

    private String producer;
    private String director;

    public Movie() {
    }

    public Movie(String producer, String director) {
        this.producer = producer;
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "producer='" + producer + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
