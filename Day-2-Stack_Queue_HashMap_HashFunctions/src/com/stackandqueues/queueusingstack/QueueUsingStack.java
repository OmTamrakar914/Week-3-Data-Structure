package com.stackandqueues.queueusingstack;

import java.util.Stack;

public class QueueUsingStack {
    private Stack <Integer> stack1;
    private Stack<Integer> stack2;

    //Constructor
    QueueUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //Enqueue operation
    public void enqueue(int value){
        stack1.push(value);
        System.out.println(value + " enqueued.");
    }

    //dequeue operation
    public void dequeue(){
        if(stack2.isEmpty()){
            if(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    //peek operation
    public void peekofQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        if(stack2.isEmpty()){
            if(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.peek();
    }

    //checking queue is empty or not
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //displaying the queue element
    public void displayQueue(){
        System.out.println("Stack element : ");
        for(int i=stack2.size()-1; i>=0; i--){
            System.out.println(stack2.get(i)+" ");
        }
        for(int i=0; i<stack1.size(); i++){
            System.out.println(stack1.get(i)+" ");
        }
    }

    public static void main(String[]args){
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.displayQueue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.displayQueue();

        queue.dequeue();

        queue.displayQueue();
        queue.peekofQueue();

        queue.displayQueue();

    }
}
