package Pertemuan_6.E_MODULARISASI_FUNGSI_DAN_PROSEDUR;

import java.util.Scanner;

public class ModularArray {

    public static double hitungRata(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return (double) total / data.length;
    }

    public static int hitungMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int hitungMin(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static void tampilData(int[] data) {
        System.out.println("\nData Array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " = " + data[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        tampilData(nilai);

        double rata = hitungRata(nilai);
        int max = hitungMax(nilai);
        int min = hitungMin(nilai);

        System.out.println("\nRata-rata = " + rata);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai minimum = " + min);
    }
}