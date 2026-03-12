package Pertemuan_6.D_STUDI_KASUS_NILAI_MAHASISWA_LENGKAP;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rata = (double) total / n;

        System.out.println("\nRata-rata nilai = " + rata);

        if (rata >= 60) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }

        System.out.println("Jumlah mahasiswa lulus = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + tidakLulus);
    }
}