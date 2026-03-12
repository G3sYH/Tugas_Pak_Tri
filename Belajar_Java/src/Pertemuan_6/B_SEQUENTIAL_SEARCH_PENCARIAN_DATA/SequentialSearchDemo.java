package Pertemuan_6.B_SEQUENTIAL_SEARCH_PENCARIAN_DATA;

import java.util.Scanner;

public class SequentialSearchDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] data = new int[n];

        // input data array
        System.out.println("Masukkan data array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // tampilkan isi array
        System.out.println("\nIsi array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Indeks [" + i + "] = " + data[i]);
        }

        // input data yang dicari
        System.out.print("\nMasukkan data yang dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        // proses sequential search
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
