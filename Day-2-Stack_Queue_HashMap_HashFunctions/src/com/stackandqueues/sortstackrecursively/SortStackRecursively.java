package com.stackandqueues.sortstackrecursively;
import java.util.Stack;
public class SortStackRecursively {

    //Inserting in order
    public static void insertInOrder(Stack<Integer> stack,int element ){
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Removing top element
        int top = stack.pop();

        // Recursively insert the element in the sorted stack
        insertInOrder(stack, element);

        // Pushing the removed element back
        stack.push(top);
    }

    //Recursively pop element from stack
    public static void sortStack(Stack <Integer> stack){

        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        int top = stack.pop();

        sortStack(stack);
        //Insert popped element at the correct position
        insertInOrder(stack,top);
    }

    //Function to print the stack
    public static void printStack(Stack<Integer>stack){
        System.out.println("Sorted Stack : "+stack);
    }

    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(12);
        stack.push(-5);
        stack.push(-3);
        stack.push(0);

        System.out.println("Original Stack : "+stack);
        sortStack(stack);
        printStack(stack);
    }
}
