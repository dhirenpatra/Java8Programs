package com.dhiren.root.designpatterns.prototype.demo;

public class DriverClass {

    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();

        Movie movie = (Movie) registry.createItem("movie");
        movie.setTitle("Badla pada bhari");

        Movie movie2 = (Movie) registry.createItem("movie");
        movie2.setTitle("Badla pada bhari phir se bht bhari");
        movie2.setPrice(32.89);

        System.err.println(movie);
        System.err.println(movie2);
    }

}
