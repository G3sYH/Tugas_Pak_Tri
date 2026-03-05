package Pertemuan_5.C_DEKLARASI_DAN_INISIALISASI_LANGSUNG;

public class DeklarasiArray3 {
    public static void main(String[] args) {

        int[] angka = { 12, 45, 7, 30, 18, 25 };

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Angka terbesar = " + terbesar);
        System.out.println("Angka terkecil = " + terkecil);
    }
}