package Pertemuan_3;

import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan tersebut adalah GENAP");
        } else {
            System.out.println("Bilangan tersebut adalah GANJIL");
        }
        input.close();
    }
}
