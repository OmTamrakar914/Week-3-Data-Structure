package com.doublylinkedlist.librarymanagementsystem;

import java.awt.print.Book;

public class BookDoublyFunctionalities {
    private BookNode head, tail;

    BookDoublyFunctionalities() {
        this.head = null;
        this.tail = null;
    }

    //adding at the beginning
    public void addAtBeginning(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {

        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, availabilityStatus);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add at the end
    public void addATEnd(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {
        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, availabilityStatus);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        BookNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    //add at a position
    public void addAtPostion(String bookTitle, String author, String genre, int bookId, String availabilityStatus,int position){
        BookNode newNode = new BookNode(bookTitle, author, genre, bookId, availabilityStatus);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addAtBeginning(bookTitle, author, genre, bookId, availabilityStatus);
            return;
        }
        BookNode temp = head;
        for(int i=0; i<position-1 && temp != null; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //removing a book by Id
    public void deleteById(int bookId) {
        if (head == null) {
            System.out.println("Book List is already empty!");
        }

        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        BookNode temp = head;
        while (temp.next != null) {
            if (temp.next.bookId == bookId) {
                //The node that we want to delete
                BookNode deleteNode = temp.next;
                if (deleteNode.next != null) {
                    deleteNode.next.prev = temp;
                    temp.next = deleteNode.next;
                }
                System.out.println("Book " + deleteNode.bookTitle + "with book id " + deleteNode.bookId + " deleted from the list");
                return;
            }
            temp = temp.next;
        }
    }

    //Searching a book by Book Title
    public void searchByTitle(String bookTitle){
        if(head == null){
            System.out.println("List Empty!");
        }
        BookNode temp = head;
        while(temp != null){
            if(temp.bookTitle.equals(bookTitle)){
                System.out.println("\n-------Book Found--------");
                System.out.println("Book Title          : "+temp.bookTitle);
                System.out.println("Book Author         : "+temp.author);
                System.out.println("Book Genre          : "+temp.genre);
                System.out.println("Book ID             : "+temp.bookId);
                System.out.println("Availability Status : "+temp.availabilityStatus);
                System.out.println("--------------------------");
            return;
            }
            temp = temp.next;
        }
    }

    //Searching a book by Book ID
    public void searchByAuthor(String author){
        if(head == null){
            System.out.println("List Empty!");
        }
        BookNode temp = head;
        while(temp != null){
            if(temp.author.equals(author)){
                System.out.println("\n-------Book Found--------");
                System.out.println("Book Title          : "+temp.bookTitle);
                System.out.println("Book Author         : "+temp.author);
                System.out.println("Book Genre          : "+temp.genre);
                System.out.println("Book ID             : "+temp.bookId);
                System.out.println("Availability Status : "+temp.availabilityStatus);
                System.out.println("--------------------------");
                return;
            }
            temp = temp.next;
        }
    }

    //update book available status
    public void updateStatus(int bookId, String status){
        if(head == null){
            System.out.println("List Empty!");
        }
        BookNode temp = head;
        while(temp != null ){
            if(temp.bookId == bookId){
                temp.availabilityStatus = status;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    //display forward
    public void displayForward(){
        if(head == null){
            System.out.println("List Empty!");
        }
        BookNode temp = head;
        while(temp != null){
            System.out.println("\n-------Book Details--------");
            System.out.println("Book Title          : "+temp.bookTitle);
            System.out.println("Book Author         : "+temp.author);
            System.out.println("Book Genre          : "+temp.genre);
            System.out.println("Book ID             : "+temp.bookId);
            System.out.println("Availability Status : "+temp.availabilityStatus);
            System.out.println("--------------------------");
            temp = temp.next;
        }

    }

    // Display books from tail to head
    public void displayBackward() {
        if (tail == null) {  // Checking tail instead of head
            System.out.println("List Empty!");
            return;  // Added return statement to prevent further execution
        }

        BookNode temp = tail;
        while (temp != null) {
            System.out.println("\n-------Book Details--------");
            System.out.println("Book Title          : " + temp.bookTitle);
            System.out.println("Book Author         : " + temp.author);
            System.out.println("Book Genre          : " + temp.genre);
            System.out.println("Book ID             : " + temp.bookId);
            System.out.println("Availability Status : " + temp.availabilityStatus);
            System.out.println("--------------------------");

            temp = temp.prev;  // Moving backward in the doubly linked list
        }
    }


    //counting all the books
    public void countBook(){
        if(head == null){
            System.out.println("List Empty!");
        }
        int count = 0;
        BookNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        System.out.println("The Total Number of books in the library is "+ count);
    }

}
