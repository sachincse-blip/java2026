import java.io.*;

class node {
    node prev;
    int data;
    node next;
    
    node(int value)
    {
        prev = null;
        data = value;
        next = null;
    }
}

class Main {
    static node head = null;
    static node tail = null;
    static void insertAtBeginning(int data)
    {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtEnd(int data)  
    {
        node temp = new node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void insertAtPosition(int data, int position)
    {
        node temp = new node(data);
      
         node current = head;
         
         for(int i=1;i<position;i++)
         {
             current=current.next;
         }
            temp.next = current;
            temp.prev = current.prev;
            current.prev.next = temp;
            current.prev = temp;
        
    }

    static void deleteAtBeginning()
    {
        if (head == null) {
            return;
        }

        node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    static void deleteAtEnd()
    {
        if (tail == null) {
            return;
        }


        node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    static void deleteAtSpecificPosition(int pos)
    {
        node current = head;
        
        for(int i=1;i<pos;i++)
        {
            current=current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }

    static void display(node head)
    {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        display(head);

        System.out.print("After insertion at head: ");
        insertAtBeginning(0);
        display(head);

        insertAtPosition(6, 2);
        System.out.print(
            "After insertion at 2nd position: ");
        display(head);

        deleteAtBeginning();
        System.out.print(
            "After deletion at the beginning: ");
        display(head);

        deleteAtEnd();
         System.out.print("After deletion at the end: ");
         display(head);

         deleteAtSpecificPosition(2);
         System.out.print(
             "After deletion at 2nd position: ");
         display(head);
    }
}
