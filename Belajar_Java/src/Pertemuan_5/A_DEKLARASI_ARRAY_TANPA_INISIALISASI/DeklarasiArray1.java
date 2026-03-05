package Pertemuan_5.A_DEKLARASI_ARRAY_TANPA_INISIALISASI;

public class DeklarasiArray1 {
    public static void main(String[] args) {

        double[] luas; // deklarasi array
        luas = new double[4]; // alokasi 4 elemen

        double r = 7;

        luas[0] = 3.14 * r * r;
        luas[1] = 3.14 * 5 * 5;
        luas[2] = 3.14 * 10 * 10;
        luas[3] = 3.14 * 12 * 12;

        for (int i = 0; i < luas.length; i++) {
            System.out.println("Luas lingkaran ke-" + (i + 1) + " = " + luas[i]);
        }

    }
}
