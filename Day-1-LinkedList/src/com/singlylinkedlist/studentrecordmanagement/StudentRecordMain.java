package com.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;
public class StudentRecordMain {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StudentRecordManagement student = new StudentRecordManagement();

        System.out.println("Adding a student record");
        student.addAtBegining(111035,"Om",22, 'A');
        student.displayRecords();

        System.out.println("Adding a student record at end");
        student.addAtEnd(111021,"Anush", 21, 'A');
        student.displayRecords();

        System.out.println("Adding a student record at a specific position");
        System.out.println("Enter the position");
        int position = sc.nextInt();
        student.addAtSpecificPosition(111025,"Pradeep",21, 'B', position);
        student.displayRecords();

        System.out.println("Deleting a student record");
        System.out.println("Enter the rollnumber");
        int rollnumber = sc.nextInt();
        student.deleteNode(rollnumber);
        student.displayRecords();
        System.out.println("Student Record Deleted");

        System.out.println("Searching a student record");
        System.out.println("Enter the rollnumber");
        int searchrollnumber = sc.nextInt();
        student.searchByRollnumber(searchrollnumber);

        System.out.println("Displaying all student record");
        student.displayRecords();

        System.out.println("Updating a student record");
        System.out.println("Enter the rollnumber");
        int updaterollnumber = sc.nextInt();
        student.updateStudentRecord(updaterollnumber,'B');

    }
}