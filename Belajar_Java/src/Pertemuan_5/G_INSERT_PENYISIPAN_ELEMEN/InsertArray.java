package Pertemuan_5.G_INSERT_PENYISIPAN_ELEMEN;

public class InsertArray {
    public static void main(String[] args) {

        int[] data = new int[6];

        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        System.out.println("Array sebelum insert:");
        for (int i = 0; i < 4; i++) {
            System.out.print(data[i] + " ");
        }

        int nilaiBaru = 25;
        int posisi = 2;

        for (int i = 4; i > posisi; i--) {
            data[i] = data[i - 1];
        }

        data[posisi] = nilaiBaru;

        System.out.println("\nArray setelah insert:");
        for (int i = 0; i < 5; i++) {
            System.out.print(data[i] + " ");
        }
    }
}