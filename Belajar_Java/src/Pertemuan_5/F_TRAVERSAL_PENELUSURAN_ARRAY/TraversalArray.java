package Pertemuan_5.F_TRAVERSAL_PENELUSURAN_ARRAY;

public class TraversalArray {
    public static void main(String[] args) {

        int[] angka = { 5, 10, 15, 20, 25, 30 };
        int jumlah = 0;

        System.out.println("Isi array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
            jumlah += angka[i];
        }

        System.out.println("Jumlah seluruh elemen = " + jumlah);
    }
}