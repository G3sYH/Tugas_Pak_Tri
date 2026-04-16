package Pertemuan_9.B_IMPLEMENTASI_STACK_MENGGUNAKAN_ARRAY;

public class StackArray {
    private int max;
    private int[] stack;
    private int top;

    public StackArray(int size) {
        this.max = size;
        this.stack = new int[max];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            stack[++top] = data;
            System.out.println(data + " ditambahkan");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return stack[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.display();
    }
}