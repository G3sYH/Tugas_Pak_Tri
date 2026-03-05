package Pertemuan_4.D_ALOKASI_MEMORI_STATIS;

import java.util.Scanner;

public class MemoriStatis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[3];
        int total = 0;

        // Input data
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + " : ");
            data[i] = input.nextInt();
            total += data[i];
        }

        // Hitung rata-rata
        double rataRata = (double) total / data.length;

        // Output
        System.out.println("\n===== DATA =====");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data[" + i + "] = " + data[i]);
        }

        System.out.println("----------------");
        System.out.println("Rata-rata = " + rataRata);
        System.out.println("================");

        input.close();
    }
}

// Tugas :
// - Meminta input dari pengguna (Scanner)
// - Hitung rata-rata nilai dan tampilkan.
