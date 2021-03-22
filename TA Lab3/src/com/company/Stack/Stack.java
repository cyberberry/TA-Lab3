package com.company.Stack;

public class Stack {
    Node top = null;

    public void push(int x) // insert at the beginning
    {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;

        temp.link = top;

        top = temp;

    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() // remove at the beginning
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = top.link;
    }

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            System.out.print("Stack: ");
            while (temp != null) {

                // print node data
                System.out.print(temp.data + " ");

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }

}

