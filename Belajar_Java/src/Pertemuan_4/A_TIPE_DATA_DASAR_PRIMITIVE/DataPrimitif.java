package Pertemuan_4.A_TIPE_DATA_DASAR_PRIMITIVE;

import java.util.Scanner;

public class DataPrimitif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur           : ");
        int umur = input.nextInt();

        System.out.print("Masukkan IPK            : ");
        double ipk = input.nextDouble();

        System.out.print("Masukkan kelas          : ");
        char kelas = input.next().charAt(0);

        System.out.print("Mahasiswa aktif? (true/false): ");
        boolean aktif = input.nextBoolean();

        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("IPK    : " + ipk);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Status : " + (aktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("==========================");

        input.close();
    }
}

// Tugas :
// Ubah program agar:
// - Meminta input dari pengguna (Scanner)
// - Menampilkan hasil dengan format lebih rapi.