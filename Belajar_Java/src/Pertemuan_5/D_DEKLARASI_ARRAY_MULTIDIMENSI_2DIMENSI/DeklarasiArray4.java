package Pertemuan_5.D_DEKLARASI_ARRAY_MULTIDIMENSI_2DIMENSI;

import java.util.Scanner;

public class DeklarasiArray4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int jumlah = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai [" + i + "][" + j + "] : ");
                matriks[i][j] = input.nextInt();
                jumlah += matriks[i][j];
            }
        }

        System.out.println("\nMatriks 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh elemen = " + jumlah);
    }
}