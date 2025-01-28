package com.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    private StudentNode head;

    //Adding a new Student at the begining

    public void addAtBegining(int rollnumber,String name,int age, char grade){
        StudentNode newNode = new StudentNode(rollnumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    //Adding a new Student at the end
    public void addAtEnd(int rollnumber, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollnumber, name, age, grade);

        StudentNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        //newNode.next = temp.next;
    }

    //Adding a new student at a specific
    public void  addAtSpecificPosition(int rollnumber, String name, int age, char grade, int position){
        StudentNode  newNode = new StudentNode(rollnumber, name, age, grade);

        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        StudentNode temp = head;

        for(int i=0; i< position - 1; i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Out of Bounds!");

        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    //Deleting a Student Record
    public void deleteNode(int rollnumber){
        if(head == null){
            System.out.println("Student Record is Empty");
        }

        StudentNode temp = head;
        while(temp.next != null && temp.next.rollNumber != rollnumber){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    //Search for a student record by roll number
    public void searchByRollnumber(int rollnumber){
        if(head == null){
            System.out.println("Student Record is Empty");
        }
        StudentNode temp = head;
        while(temp!= null){
            if(temp.rollNumber == rollnumber){
                System.out.println("--------Student Found ------");
                System.out.println("Rollnmuber : "+temp.rollNumber);
                System.out.println("Name       : "+temp.name);
                System.out.println("Age        : "+temp.age);
                System.out.println("Grade      : "+temp.grade);

                return;
            }
            temp = temp.next;
        }
        System.out.println("Student Record not Found!");
    }

    //Displaying the students Record
    public void displayRecords() {
        if (head == null) {
            System.out.println("Student Record is Empty");
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("\n--------Student Record ------");
            System.out.println("Rollnmuber : " + temp.rollNumber);
            System.out.println("Name       : " + temp.name);
            System.out.println("Age        : " + temp.age);
            System.out.println("Grade      : " + temp.grade);

            temp = temp.next;
        }
    }

    //Updating a students record by rollnumber
    public void updateStudentRecord(int rollnumber, char grade){
        if (head == null) {
            System.out.println(" Record is Empty");
        }
        StudentNode temp = head;
        while(temp != null) {
            if(temp.rollNumber == rollnumber){
                temp.grade = grade;
                displayRecords();
                System.out.println("Student record updated!");
                return;
            }
            temp = temp.next;
        }
    }
}
