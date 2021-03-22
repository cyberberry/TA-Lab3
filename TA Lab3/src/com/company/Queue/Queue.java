package com.company.Queue;

public class Queue {
    public QNode front, rear = null;

    // Method to add a key to the queue.
    public void enqueue(int key) {
        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;


    }

    // Method to remove an key from queue.
    public void dequeue() {
        if (this.front == null)
            return;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

    }

    public void display() {
        if(this.front == null) {
            System.out.println("Queue is empty!!!");
        }
        else {
            QNode temp = front;
            System.out.print(temp.key + " ");
            for (int i = 0; temp.next != rear; i++ ) {
                temp = temp.next;
                System.out.print( temp.key + " ");
            }
            System.out.println(rear.key);

        }


    }

}
