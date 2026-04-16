package Uts;

import java.util.Scanner;

class data_mahasiswa {
    String nim;
    String nama;
    double nilai;
    data_mahasiswa next;

    // Constructor
    data_mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.next = null;
    }
}

class SingleLinkedList {
    data_mahasiswa head;

    // Insert First
    void insertFirst(String nim, String nama, double nilai) {
        data_mahasiswa newdata_mahasiswa = new data_mahasiswa(nim, nama, nilai);

        if (head == null) {
            head = newdata_mahasiswa;
        } else {
            newdata_mahasiswa.next = head;
            head = newdata_mahasiswa;
        }

        System.out.println("Data berhasil ditambahkan di awal.");
    }

    // Insert Last
    void insertLast(String nim, String nama, double nilai) {
        data_mahasiswa newdata_mahasiswa = new data_mahasiswa(nim, nama, nilai);

        if (head == null) {
            head = newdata_mahasiswa;
        } else {
            data_mahasiswa temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newdata_mahasiswa;
        }

        System.out.println("Data berhasil ditambahkan di akhir.");
    }

    // Delete berdasarkan NIM
    void deleteByNIM(String nim) {
        if (head == null) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (head.nim.equals(nim)) {
            head = head.next;
            System.out.println("Data berhasil dihapus.");
            return;
        }

        data_mahasiswa temp = head;

        while (temp.next != null) {
            if (temp.next.nim.equals(nim)) {
                temp.next = temp.next.next;
                System.out.println("Data berhasil dihapus.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Data dengan NIM tersebut tidak ditemukan.");
    }

    // Cari Mahasiswa
    void search(String nim) {
        data_mahasiswa temp = head;

        while (temp != null) {
            if (temp.nim.equals(nim)) {
                System.out.println("Data ditemukan:");
                System.out.println("NIM   : " + temp.nim);
                System.out.println("Nama  : " + temp.nama);
                System.out.println("Nilai : " + temp.nilai);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Data tidak ditemukan.");
    }

    // Tampilkan semua data
    void display() {
        if (head == null) {
            System.out.println("Linked List kosong.");
            return;
        }

        data_mahasiswa temp = head;

        System.out.println("TAMPILKAN SEMUA DATA");

        while (temp != null) {
            System.out.println("NIM   : " + temp.nim);
            System.out.println("Nama  : " + temp.nama);
            System.out.println("Nilai : " + temp.nilai);
            System.out.println("--");

            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();

        int pilihan;

        do {
            System.out.println("\nMENU LINKED LIST MAHASISWA");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Edit Data Mahasiswa");
            System.out.println("3. Hapus Data Mahasiswa");
            System.out.println("4. Cari Data Mahasiswa");
            System.out.println("5. Tampilkan Semua Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            String nim, nama;
            double nilai;

            switch (pilihan) {

                case 1:
                    System.out.println("\nTAMBAH DATA MAHASISWA");

                    System.out.print("Masukkan NIM : ");
                    nim = input.nextLine();

                    System.out.print("Masukkan Nama : ");
                    nama = input.nextLine();

                    System.out.print("Masukkan Nilai : ");
                    nilai = input.nextDouble();

                    list.insertFirst(nim, nama, nilai);
                    break;

                case 2:
                    System.out.println("\nEDIT DATA MAHASISWA");

                    System.out.print("Masukkan NIM : ");
                    nim = input.nextLine();

                    System.out.print("Masukkan Nama : ");
                    nama = input.nextLine();

                    System.out.print("Masukkan Nilai : ");
                    nilai = input.nextDouble();

                    list.insertLast(nim, nama, nilai);
                    break;

                case 3:
                    System.out.println("\nHAPUS DATA MAHASISWA");

                    System.out.print("Masukkan NIM yang akan dihapus : ");
                    nim = input.nextLine();

                    list.deleteByNIM(nim);
                    break;

                case 4:
                    System.out.println("\nCARI DATA MAHASISWA");

                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();

                    list.search(nim);
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 6);

        input.close();
    }
}
