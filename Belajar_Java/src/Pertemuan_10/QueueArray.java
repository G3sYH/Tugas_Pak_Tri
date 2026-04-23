package Pertemuan_10;

import java.util.Scanner;

// Class QueueArray
public class QueueArray {
    int max = 5;
    int[] queue = new int[max];
    int front = -1, rear = -1;

    // Cek kosong
    public boolean isEmpty() {
        return front == -1;
    }

    // Cek penuh
    public boolean isFull() {
        return rear == max - 1;
    }

    // Menambah data ke queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue penuh");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            queue[++rear] = data;
            System.out.println(data + " masuk ke queue");
        }
    }

    // Menghapus data dari queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println(queue[front++] + " keluar dari queue");
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    // Melihat elemen terdepan
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Elemen terdepan: " + queue[front]);
        }
    }

    // Menampilkan isi queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.print("Isi queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Program utama
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        Scanner input = new Scanner(System.in);
        int pilihan, data;
        do {
            System.out.println("\n=== MENU QUEUE ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Tampilkan Queue");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    data = input.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
        input.close();
    }
}