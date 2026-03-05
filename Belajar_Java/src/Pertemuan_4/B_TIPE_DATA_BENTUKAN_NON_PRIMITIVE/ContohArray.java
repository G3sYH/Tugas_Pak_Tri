package Pertemuan_4.B_TIPE_DATA_BENTUKAN_NON_PRIMITIVE;

import java.util.Scanner;

public class ContohArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = scanner.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = scanner.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("\n===== DAFTAR NILAI =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }

        System.out.println("------------------------");
        System.out.println("Rata-rata nilai = " + rataRata);
        System.out.println("========================");

        scanner.close();
    }
}

// Tugas :
// - Meminta input dari pengguna (Scanner)
// - Hitung rata-rata nilai dan tampilkan.