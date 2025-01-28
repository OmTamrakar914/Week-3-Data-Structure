package com.doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;
public class MovieManagementSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedlist movie = new MovieDoublyLinkedlist();

        System.out.print("Adding movie at the beginning");

        movie.addAtBeginning("Batman","christopher nolan",2001,8.5);
        movie.addAtBeginning("SpiderMan","Stanley",2008,8.0);
        movie.displayAllMovie();

        System.out.println("Adding movie at the End");
        System.out.println("Adding movie - Conjuring");
        movie.addAtEnd("Conjuring","Warner Brothers",2013,7.5);
        movie.displayAllMovie();

        System.out.println("Adding movie at a Specific Position");
        System.out.println("Adding movie - OpenHeimer");
        System.out.println("Enter the position");
        int post = sc.nextInt();
        movie.addAtSpecificPosition("OpenHeimer","christopher nolan",2024,9.0,post);
        movie.displayAllMovie();

        System.out.println("Delete a Movie");
        System.out.println("Enter the Movie");
        String name = sc.next();
        movie.deleteNode(name);
        System.out.println(" Movie Delete !");
        movie.displayAllMovie();

        System.out.println("Searching a Movie");
        System.out.println("Enter the Movie Director ");
        String director = sc.next();
        movie.searchMovieNodeDirector(director);
        System.out.println("Enter the Movie rating ");
        double rating = sc.nextDouble();
        movie.searchMovieNodeRating(rating);

        System.out.println("Displaying all Movies");
        movie.displayAllMovie();

        System.out.println("Updating a Movie");
        System.out.println("Enter the Movie title");
        String title = sc.next();
        System.out.println("Enter the Movie rating to update");
        double newrating = sc.nextDouble();
        movie.updateRating(title, newrating);
        movie.displayAllMovie();




    }
}
