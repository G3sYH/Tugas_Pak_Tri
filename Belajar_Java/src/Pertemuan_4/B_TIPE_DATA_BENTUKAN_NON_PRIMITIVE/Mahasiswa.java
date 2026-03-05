package Pertemuan_4.B_TIPE_DATA_BENTUKAN_NON_PRIMITIVE;

public class Mahasiswa {
    String nama;
    int umur;
    double ipk;
    String jurusan;

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("IPK     : " + ipk);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("==========================");
    }
}

// Tugas :
// Tambahkan:
// - Meminta input dari pengguna (Scanner)
// - atribut jurusan
// - metode tampilData() dalam class Mahasiswa.