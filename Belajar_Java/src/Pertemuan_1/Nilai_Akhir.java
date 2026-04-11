package Pertemuan_1;

import java.util.Scanner;

public class Nilai_Akhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, uts, uas, nilaiAkhir;
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();
        nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        System.out.println("Nilai Akhir Mahasiswa: " + nilaiAkhir);
        input.close();
    }
}
