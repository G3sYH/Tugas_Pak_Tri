package Pertemuan_9.Tugas;

import java.util.Scanner;

public class StackMenu {

    private int max;
    private int[] stack;
    private int top;

    // Constructor
    public StackMenu(int size) {
        this.max = size;
        this.stack = new int[max];
        this.top = -1;
    }

    // Cek stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Cek stack penuh
    public boolean isFull() {
        return top == max - 1;
    }

    // Push (tambah data)
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            stack[++top] = data;
            System.out.println("Data " + data + " berhasil ditambahkan");
        }
    }

    // Pop (hapus data)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            int data = stack[top--];
            return data;
        }
    }

    // Peek (lihat data teratas)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Display (tampilkan semua data)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.println("Isi Stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main Program (Menu Interaktif)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran stack: ");
        int ukuran = input.nextInt();

        StackMenu stack = new StackMenu(ukuran);

        int pilihan;

        do {
            System.out.println("\n=== MENU STACK ===");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan data: ");
                    int data = input.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    int popData = stack.pop();
                    if (popData != -1) {
                        System.out.println("Data di-pop: " + popData);
                    }
                    break;

                case 3:
                    int peekData = stack.peek();
                    if (peekData != -1) {
                        System.out.println("Data teratas: " + peekData);
                    }
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}