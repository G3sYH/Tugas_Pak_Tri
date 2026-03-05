package Pertemuan_4.C_VARIABEL_DAN_KONSTANTA;

public class VariabelKonstanta {
    public static void main(String[] args) {
        final int MAX_NILAI = 100;
        int nilai = 85;
        System.out.println("Nilai: " + nilai);
        System.out.println("Nilai Maksimum: " + MAX_NILAI);
    }
}

// Tugas :
// - Coba ubah MAX_NILAI → amati error.
// - Jelaskan mengapa error terjadi.

// Error terjadi karena variabel MAX_NILAI dideklarasikan menggunakan kata kunci
// final, yang berarti variabel tersebut
// bersifat konstan dan nilainya tidak dapat diubah setelah pertama kali
// diinisialisasi. Ketika program mencoba mengubah
// nilai MAX_NILAI, Java akan menolak dan menampilkan error saat proses
// kompilasi karena perubahan terhadap variabel final
// tidak diperbolehkan. Tujuan penggunaan final adalah untuk menjaga konsistensi
// nilai dan mencegah perubahan yang tidak
// disengaja selama program berjalan.