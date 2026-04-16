package Pertemuan_9.C_IMPLEMENTASI_STACK_MENGGUNAKAN_LINKED_LIST;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " ditambahkan");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return top.data;
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.display();
    }
}
