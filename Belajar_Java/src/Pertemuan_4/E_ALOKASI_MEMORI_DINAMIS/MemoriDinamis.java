package Pertemuan_4.E_ALOKASI_MEMORI_DINAMIS;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoriDinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        // Input dari pengguna (total 8 elemen)
        System.out.println("Masukkan 8 data integer:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data.add(input.nextInt());
        }

        // Tampilkan data awal
        System.out.println("\nData sebelum dihapus: " + data);

        // Hapus elemen index ke-2
        data.remove(2);

        // Tampilkan data setelah dihapus
        System.out.println("Data setelah index ke-2 dihapus: " + data);

        input.close();
    }
}