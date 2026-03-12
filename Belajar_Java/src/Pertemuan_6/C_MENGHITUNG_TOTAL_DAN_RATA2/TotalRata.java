package Pertemuan_6.C_MENGHITUNG_TOTAL_DAN_RATA2;

import java.util.Scanner;

public class TotalRata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        System.out.println("Masukkan nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int total = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > max) {
                max = nilai[i];
            }

            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        double rata = (double) total / n;

        System.out.println("\nTotal nilai = " + total);
        System.out.println("Rata-rata nilai = " + rata);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai minimum = " + min);
    }
}