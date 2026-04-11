package Pertemuan_1;

import java.util.Scanner;

public class Input_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== LATIHAN TIPE DATA JAVA ===");
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan grade : ");
        char grade = input.next().charAt(0);
        System.out.print("Apakah lulus (true/false): ");
        boolean lulus = input.nextBoolean();
        System.out.println("\n=== DATA YANG ANDA MASUKKAN ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Grade : " + grade);
        System.out.println("Status Lulus : " + lulus);
        input.close();
    }
}