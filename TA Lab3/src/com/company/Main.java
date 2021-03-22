package com.company;

import com.company.DoublyLinkedList.DoublyLinkedList;
import com.company.Queue.Queue;
import com.company.SinglyLinkedList.SinglyLinkedList;
import com.company.Stack.Stack;


public class Main {

    public static void main(String[] args) {
        

        SinglyLinkedList slist = new SinglyLinkedList();
        System.out.println("Singly Linked List");
        System.out.println();
        slist.pushStart(4);
        slist.pushStart(3);
        slist.pushStart(2);
        slist.pushStart(1);
        slist.insertAfter(slist.head.next,10);
        slist.pushEnd(100);
        slist.show();
        System.out.println();
        slist.deleteStart();
        slist.deleteNodeAtGivenPos(2);
        slist.deleteEnd();
        slist.show();
        System.out.print("Пошук елементу 100 в списку:  ");
        slist.searchNode(100);
        System.out.print("Пошук елементу 200 в списку:  ");
        slist.searchNode(200);
        System.out.println("--------------------------");




        DoublyLinkedList dlist = new DoublyLinkedList();
        System.out.println("Doubly Linked List");

        dlist.PushStart(2);
        dlist.PushEnd(3);
        dlist.PushEnd(4);
        dlist.PushStart(0);
        dlist.PushStart(-1);
        dlist.insertAfter(dlist.head.next,12);

        dlist.show();
        System.out.println();
        dlist.deleteNodeAtGivenPos(3);
        dlist.deleteEnd();
        dlist.deleteStart();
        dlist.show();
        System.out.print("Пошук елементу 120 в списку:  " );
        dlist.searchNode(120);
        System.out.print("Пошук елементу 40 в списку:  " );
        dlist.searchNode(40);
        System.out.println("--------------------------");

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue: ");
        System.out.println("Перший елемент черги: " + queue.front.key);
        System.out.println("Останній елемент черги: " + queue.rear.key);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println();
        System.out.println("----------------------");

        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Перший елемент стеку: " + stack.peek());
        stack.display();
        System.out.println();
        stack.pop();
        stack.pop();
        stack.display();




    }
}

