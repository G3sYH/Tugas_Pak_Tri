package Pertemuan_10.A_IMPLEMENTASI_QUEUE_MENGGUNAKAN_ARRAY.Tugas_A;

import java.util.Scanner;

public class CircularQueue {

    int max = 5;
    int[] queue = new int[max];

    int front = -1;
    int rear = -1;

    // Cek kosong
    public boolean isEmpty() {
        return front == -1;
    }

    // Cek penuh (circular)
    public boolean isFull() {
        return (rear + 1) % max == front;
    }

    // Tambah data
    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue penuh!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        queue[rear] = data;

        System.out.println(data + " masuk ke queue");
    }

    // Hapus data
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }

        System.out.println(queue[front] + " keluar dari queue");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
    }

    // Lihat depan
    public void peek() {

        if (isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            System.out.println("Elemen terdepan: " + queue[front]);
        }
    }

    // Tampilkan isi queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }

        System.out.print("Isi queue: ");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % max;
        }

        System.out.println();
    }

    // Method size()
    public int size() {

        if (isEmpty())
            return 0;

        if (rear >= front)
            return rear - front + 1;

        return max - front + rear + 1;
    }

    // Method clear()
    public void clear() {

        front = rear = -1;

        System.out.println("Queue berhasil dikosongkan");
    }

    // Method contains()
    public boolean contains(int value) {

        if (isEmpty())
            return false;

        int i = front;

        while (true) {

            if (queue[i] == value)
                return true;

            if (i == rear)
                break;

            i = (i + 1) % max;
        }

        return false;
    }

    // Program utama
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        Scanner input = new Scanner(System.in);

        int pilihan, data;

        do {

            System.out.println("\n=== MENU CIRCULAR QUEUE ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Tampilkan Queue");
            System.out.println("5. Size");
            System.out.println("6. Clear");
            System.out.println("7. Contains");
            System.out.println("8. Keluar");

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
                    System.out.println("Jumlah elemen: " + q.size());
                    break;

                case 6:
                    q.clear();
                    break;

                case 7:
                    System.out.print("Cari nilai: ");
                    data = input.nextInt();

                    if (q.contains(data))
                        System.out.println("Data ditemukan");
                    else
                        System.out.println("Data tidak ditemukan");

                    break;

                case 8:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 8);

        input.close();
    }
}
