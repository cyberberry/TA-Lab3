package com.company.SinglyLinkedList;

import java.time.Duration;
import java.time.Instant;

public class SinglyLinkedList {
    public int size;
    public Node head = null;
    public Node tail = null;
    Instant start = Instant.now();

    //Add a node at the front
    public void pushStart(int newData) {
        Node newNode = new Node(newData);

        if(head == null) {
            head  = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        size ++;
        Instant ends = Instant.now();
        System.out.println("Додати елемент(початок): " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    //Add a node at the end
    public void pushEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }

        tail = newNode;
        size ++;
        Instant ends = Instant.now();
        System.out.println("Додати елемент(кінець): " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    //Add a node after a given node
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The previous node cannot be null!");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;

        Instant ends = Instant.now();
        System.out.println("Додати елемент(після вказаного вузла): " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size );

    }

    public void deleteStart() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail) {
                head = head.next;

            }
            else {
                head = tail = null;
            }
            size --;
        }
        Instant ends = Instant.now();
        System.out.println("Видалити перший елемент: " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);

    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
            size -- ;
        }

        Instant ends = Instant.now();
        System.out.println("Видалити останній елемент: " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);

    }

    //delete node after a given position
    public void deleteNodeAtGivenPos(int position)
    {
        if (head == null) {
            return;
        }

        Node temp = head;

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;

        temp.next = next;
        size--;

        Instant ends = Instant.now();
        System.out.println("Видалити елемент(після вказаного вузла): " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("Список пустий");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Елемент в списку знаходиться на позиції : " + i);
        else
            System.out.println("Елемент відсутній в списку");
        Instant ends = Instant.now();
        System.out.println("\nПошук елемента в двобічно зв'язаному списку: " + Duration.between(start, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void show() {
        Node current = head;
        if(head == null) {
            System.out.println("Однобічно зв'язаний список пустий");
            return;
        }
        System.out.println("\nОднобічно зв'язаний список: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


