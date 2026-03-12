package Pertemuan_6.A_DEKLARASI_PENGISIAN_DAN_AKSES_ARRAY;

import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        System.out.println("=== INPUT NILAI ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("\n=== DATA NILAI ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks [" + i + "] = " + nilai[i]);
        }
    }
}