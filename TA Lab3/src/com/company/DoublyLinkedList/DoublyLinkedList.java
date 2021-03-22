package com.company.DoublyLinkedList;
import java.time.Duration;
import java.time.Instant;

public class DoublyLinkedList {
    public DoubleNode head, tail = null;
    public int size;
    Instant starts = Instant.now();

    public void PushStart(int data) {

        DoubleNode newDoubleNode = new DoubleNode(data);

        if(head == null) {
            head = tail = newDoubleNode;
            head.prev = null;
            tail.next = null;
        }
        else {

            head.prev = newDoubleNode;
            newDoubleNode.next = head;
            newDoubleNode.prev = null;
            head = newDoubleNode;
        }
        size ++;
        Instant ends = Instant.now();
        System.out.println("Додати елемент(початок): " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void PushEnd(int data) {
        DoubleNode newDoubleNode = new DoubleNode(data);
        if(head == null) {
            head = tail = newDoubleNode;
            head.prev = null;
        }
        else {
            tail.next = newDoubleNode;
            newDoubleNode.prev = tail;
            tail = newDoubleNode;
        }
        tail.next = null;
        size ++;
        Instant ends = Instant.now();
        System.out.println("Додати елемент(кінець): " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void insertAfter(DoubleNode prevNode, int newData)
    {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        DoubleNode newNode = new DoubleNode(newData);

        newNode.next = prevNode.next;

        prevNode.next = newNode;

        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        size++;
        Instant ends = Instant.now();
        System.out.println("Додати елемент(після вказаного вузла): " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void deleteStart() {
        if(head == null) {
            return;
        }
        else {
            if(head != tail) {
                head = head.next;
                head.prev = null;
            }
            else {
                head = tail = null;
            }
            size --;
        }
        Instant ends = Instant.now();
        System.out.println("Видалити перший елемент: " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void deleteEnd() {
        if(head == null) {
            return;
        }
        else {
            if(head != tail) {
                tail = tail.prev;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
            size -- ;
        }
        Instant ends = Instant.now();
        System.out.println("Видалити останній елемент: " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void deleteNodeAtGivenPos(int n)
    {
        if (head == null || n < 0) {
            return;
        }

        DoubleNode current = head;

        for (int i = 0; current != null && i < n; i++)
        {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        size--;

        Instant ends = Instant.now();
        System.out.println("Видалити елемент(після вказаного вузла): " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void searchNode(int value) {
        int i = 1;
        boolean a = false;
        DoubleNode current = head;

        if(head == null) {
            System.out.println("Список порожній");
            return;
        }
        while(current != null) {
            if(current.data == value) {
                a = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(a)
            System.out.println("Елемент в списку знаходиться на позиції : " + i);
        else
            System.out.println("Елемента нема в списку");
        Instant ends = Instant.now();
        System.out.println('\n' + "Пошук елемента в двобічно зв'язаному списку: " + Duration.between(starts, ends).toNanos() + " нс. \nКількість елементів: " + size);
    }

    public void show() {
        DoubleNode current = head;
        if(head == null) {
            System.out.println("\nДвобічно зв'язаний список пустий");
            return;
        }
        System.out.println("\nДвобічно зв'язаний список : ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

