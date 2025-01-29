package com.doublylinkedlist.librarymanagementsystem;

public class LibrarayManagementSystem {
    public static void main(String[]args){
        BookDoublyFunctionalities book = new BookDoublyFunctionalities();

        System.out.println("Adding book at the beginning");
        book.addAtBeginning("Shape","Ed Sheeren","classic",201,"Available");
        book.addAtBeginning("RightNow","Akon","Freedom",202,"Not Available");
        book.displayForward();
        book.addAtBeginning("MockingBird","Eminem","Rap",203,"Available");
        book.displayForward();

        System.out.println("Adding book at the End");
        book.addATEnd("Hall Fame","Band","Motivate",204,"Not Available");
        book.displayForward();

        System.out.println("Adding book at the Postion");
        book.addAtPostion("Enchanted","Taylor","Melody",205,"Not Available", 2);
        book.displayForward();

        System.out.println("Remove by book Id - 203");
        book.deleteById(203);
        book.displayForward();

        System.out.println("Search for Book by Title - Enchanted");
        book.searchByTitle("Enchanted");


        System.out.println("Search for Book by Author - Akon");
        book.searchByAuthor("Akon");



        System.out.println("Updating a book available status by id - 204");
        book.updateStatus(204,"Available");
        book.displayForward();


        System.out.println("Displaying Forward");
        book.displayForward();

        System.out.println("Displaying Backward");
        book.displayBackward();

        System.out.println("Total Number of books in the library :- ");
        book.countBook();

    }

}
