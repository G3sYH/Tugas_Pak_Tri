package Pertemuan_3;

import java.util.Scanner;

public class Grade_Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 75) {
            System.out.println("Grade: B");
        } else if (nilai >= 65) {
            System.out.println("Grade: C");
        } else if (nilai >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
        input.close();
    }
}
