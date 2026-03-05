package Pertemuan_4.B_TIPE_DATA_BENTUKAN_NON_PRIMITIVE;

import java.util.Scanner;

public class ContohObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        // Input data
        System.out.print("Masukkan nama    : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan umur    : ");
        mhs.umur = input.nextInt();

        System.out.print("Masukkan IPK     : ");
        mhs.ipk = input.nextDouble();
        input.nextLine(); // membersihkan enter

        System.out.print("Masukkan jurusan : ");
        mhs.jurusan = input.nextLine();

        // Tampilkan data
        mhs.tampilData();

        input.close();
    }
}

// Tugas :
// Tambahkan:
// - Meminta input dari pengguna (Scanner)
// - atribut jurusan
// - metode tampilData() dalam class Mahasiswa.
