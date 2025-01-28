package com.doublylinkedlist.moviemanagementsystem;

public class MovieDoublyLinkedlist {
    private MovieNode head, tail;

    MovieDoublyLinkedlist(){
        this.head = null;
        this.tail = null;
    }

    //Adding at the beginning
    public void addAtBeginning(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Adding at the end
    public void addAtEnd(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        MovieNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    //Adding at a specific position
    public void addAtSpecificPosition(String movieTitle, String director, int yearOfRelease, double rating,int position){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        MovieNode temp = head;
        for(int i=0; i<position - 1; i++ ){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Out of Bounds!");
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    //Deleting a Movie Node
    public void deleteNode(String movieTitle){
        if(head == null){
            System.out.println("The Movie list is already Empty!");
        }
        MovieNode temp = head;
        while(temp.next != null && temp.next.movieTitle != movieTitle ){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    //Seach a movie by Director
    public void searchMovieNodeDirector(String director){
        if(head == null){
            System.out.println("The Movie list is already Empty!");
        }
        MovieNode temp = head;
        while(temp != null){
            if(temp.director == director){
                System.out.println("\n------Movie Found!----------");
                System.out.println("Movie Title           : "+temp.movieTitle);
                System.out.println("Movie Director        : "+temp.director);
                System.out.println("Movie Year of Release : "+temp.yearOfRelease);
                System.out.println("Movie Rating          : "+temp.rating);
                System.out.println("-----------------------------");
                return;
            }
            temp = temp.next;
        }
    }
    //Search a movie by rating
    public void searchMovieNodeRating(double rating){
        if(head == null){
            System.out.println("The Movie list is already Empty!");
        }
        MovieNode temp = head;
        while(temp != null){
            if(temp.rating == rating){
                System.out.println("\n------Movie Found!----------");
                System.out.println("Movie Title           : "+temp.movieTitle);
                System.out.println("Movie Director        : "+temp.director);
                System.out.println("Movie Year of Release : "+temp.yearOfRelease);
                System.out.println("Movie Rating          : "+temp.rating);
                System.out.println("-----------------------------");
                return;
            }
            temp = temp.next;
        }
    }

    //Displaying all Movies
    public void displayAllMovie(){
        if(head == null){
            System.out.println("The Movie list is Empty!");
        }
        MovieNode temp = head;
        while(temp != null){
            System.out.println("\n------Movie Details----------");
            System.out.println("Movie Title           : "+temp.movieTitle);
            System.out.println("Movie Director        : "+temp.director);
            System.out.println("Movie Year of Release : "+temp.yearOfRelease);
            System.out.println("Movie Rating          : "+temp.rating);
            System.out.println("-----------------------------");
            temp = temp.next;
        }
    }

    //Updating a movie rating by movie title
    public void updateRating(String movieTitle, double rating ){
        if(head == null){
            System.out.println("The Movie list is Empty!");
        }
        MovieNode temp = head;
        while(temp.next != null){
            if(temp.movieTitle == movieTitle){
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

}
