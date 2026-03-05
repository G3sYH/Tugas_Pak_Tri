package Pertemuan_5.B_DEKLARASI_ARRAY_DENGAN_ALOKASI_LANGSUNG;

import java.util.Scanner;

public class DeklarasiArray2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        System.out.println("Jumlah seluruh elemen = " + jumlah);
    }
}
