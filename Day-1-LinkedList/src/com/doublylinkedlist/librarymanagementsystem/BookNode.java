package com.doublylinkedlist.librarymanagementsystem;

public class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    String availabilityStatus;
    BookNode prev;
    BookNode next;

    //Constructor
    BookNode(String bookTitle, String author, String genre, int bookId, String availabilityStatus ){
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;
        this.prev = null;
        this.next = null;
    }
}
