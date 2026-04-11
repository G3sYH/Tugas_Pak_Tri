package Pertemuan_3;

import java.util.Scanner;

public class Menu_Interaktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Keliling Lingkaran");
            System.out.println("3. Tampilkan Salam");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    System.out.println("Luas Persegi = " + (sisi * sisi));
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    System.out.println("Luas Lingkaran = " + (3.14 * r * r));
                    break;
                case 3:
                    System.out.println("Halo! Selamat Belajar Java");
                    break;
                case 4:
                    System.out.println("Terima Kasih, program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
        input.close();
    }
}
