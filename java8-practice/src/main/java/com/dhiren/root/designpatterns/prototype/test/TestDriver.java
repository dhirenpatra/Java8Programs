
package com.dhiren.root.designpatterns.prototype.test;

import com.dhiren.root.designpatterns.prototype.common.Movie;

public class TestDriver {

	public static void main(String[] args) throws InterruptedException {

		Movie movie = new Movie("Karan Johar", "Dhiren Kumar");

		Bollywood baaghi2 = new Bollywood("Baaghi 2", "Tiger Shroff", "Disha Patani", movie);
		Bollywood baaghi3 = baaghi2.clone();
		printMovieDetails(baaghi2);
		printMovieDetails(baaghi3);
        modifyBaaghi3(baaghi3);
        printMovieDetailsAfterChange(baaghi2);
        printMovieDetailsAfterChange(baaghi3);

	}

	private static void printMovieDetails(Bollywood bollywood) {
		System.out.println("Actor is " + bollywood.getActor());
		System.out.println("Actress is " + bollywood.getActress());
		System.out.println("Title is " + bollywood.getTitle());
		System.out.println("Director is " + bollywood.getMovie()
		        .getDirector());
		System.out.println("Producer is " + bollywood.getMovie()
		        .getProducer());
	}

    private static void printMovieDetailsAfterChange(Bollywood bollywood) {
        System.err.println("Actor is " + bollywood.getActor());
        System.err.println("Actress is " + bollywood.getActress());
        System.err.println("Title is " + bollywood.getTitle());
        System.err.println("Director is " + bollywood.getMovie()
                .getDirector());
        System.err.println("Producer is " + bollywood.getMovie()
                .getProducer());
    }

	private static void modifyBaaghi3(Bollywood bollywood) {
	    bollywood.getMovie().setDirector("Yash Chopra");
    }

}
