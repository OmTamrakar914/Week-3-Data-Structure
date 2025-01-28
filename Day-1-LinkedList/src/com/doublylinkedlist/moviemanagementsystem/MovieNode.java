package com.doublylinkedlist.moviemanagementsystem;

public class MovieNode {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode prev;
    MovieNode next;

    //Constructor
    MovieNode(String movieTitle, String director, int yearOfRelease, double rating){
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
