package Pertemuan_10.B_IMPLEMENTASI_QUEUE_MENGGUNAKAN_LINKED_LIST.Tugas_B;

import java.util.Scanner;

// Node generic
class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Queue Linked List Generic
public class QueueLinkedList<T> {

    Node<T> front;
    Node<T> rear;

    // Cek kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Tambah data
    public void enqueue(T data) {

        Node<T> newNode = new Node<>(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " masuk ke queue");
    }

    // Hapus data
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }

        System.out.println(front.data + " keluar dari queue");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Lihat depan
    public void peek() {

        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Elemen terdepan: " + front.data);
        }
    }

    // Tampilkan isi
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }

        Node<T> temp = front;

        System.out.print("Isi queue: ");

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }

    // Method size()
    public int size() {

        int count = 0;

        Node<T> temp = front;

        while (temp != null) {

            count++;

            temp = temp.next;
        }

        return count;
    }

    // Method getRear()
    public T getRear() {

        if (isEmpty()) {
            return null;
        }

        return rear.data;
    }

    // Method search()
    public boolean search(T value) {

        Node<T> temp = front;

        while (temp != null) {

            if (temp.data.equals(value)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // MAIN PROGRAM (uji dengan String)
    public static void main(String[] args) {

        QueueLinkedList<String> q = new QueueLinkedList<>();

        Scanner input = new Scanner(System.in);

        int pilihan;
        String data;

        do {

            System.out.println("\n=== MENU QUEUE LINKED LIST ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Tampilkan Queue");
            System.out.println("5. Size");
            System.out.println("6. Get Rear");
            System.out.println("7. Search");
            System.out.println("8. Keluar");

            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan data: ");
                    data = input.nextLine();
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
                    System.out.println("Elemen belakang: " + q.getRear());
                    break;

                case 7:
                    System.out.print("Cari data: ");
                    data = input.nextLine();

                    if (q.search(data))
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
