package Pertemuan_10.C_STUDI_KASUS_SISTEM_ANTRIAN_MAHASISWA.Tugas_C;

import java.util.*;

// Class Mahasiswa
class Mahasiswa {

    String nim;
    String nama;
    String prodi;
    long waktuKedatangan;

    Mahasiswa(String nim, String nama, String prodi) {

        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;

        this.waktuKedatangan = System.currentTimeMillis();
    }

    // Hitung lama antri
    public long hitungWaktuAntri() {

        long sekarang = System.currentTimeMillis();

        return (sekarang - waktuKedatangan) / 1000;
    }

    public String toString() {

        return nim + " - " + nama + " (" + prodi + ")";
    }
}

public class AntrianMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PRIORITY: Teknik Informatika didahulukan
        Comparator<Mahasiswa> prioritas = (m1, m2) -> {

            if (m1.prodi.equalsIgnoreCase("Teknik Informatika")
                    && !m2.prodi.equalsIgnoreCase("Teknik Informatika"))
                return -1;

            if (!m1.prodi.equalsIgnoreCase("Teknik Informatika")
                    && m2.prodi.equalsIgnoreCase("Teknik Informatika"))
                return 1;

            return 0;
        };

        // Dua loket
        PriorityQueue<Mahasiswa> loket1 = new PriorityQueue<>(prioritas);

        PriorityQueue<Mahasiswa> loket2 = new PriorityQueue<>(prioritas);

        int pilihan;

        do {

            System.out.println("\n=== SISTEM ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Terdepan");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Keluar");

            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // Tambah antrian
                case 1:

                    System.out.print("Pilih Loket (1 / 2): ");
                    int loket = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();

                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan Prodi: ");
                    String prodi = input.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi);

                    if (loket == 1) {

                        loket1.add(m);

                    } else if (loket == 2) {

                        loket2.add(m);

                    } else {

                        System.out.println("Loket tidak valid");
                    }

                    System.out.println(nama + " masuk antrian");

                    break;

                // Layani mahasiswa
                case 2:

                    System.out.print("Layani Loket (1 / 2): ");
                    loket = input.nextInt();
                    input.nextLine();

                    PriorityQueue<Mahasiswa> target = (loket == 1) ? loket1 : loket2;

                    if (target.isEmpty()) {

                        System.out.println("Antrian kosong");

                    } else {

                        Mahasiswa dilayani = target.poll();

                        System.out.println("\nDilayani:");
                        System.out.println(dilayani);

                        System.out.println(
                                "Lama antri: "
                                        + dilayani.hitungWaktuAntri()
                                        + " detik");
                    }

                    break;

                // Lihat terdepan
                case 3:

                    System.out.print("Lihat Loket (1 / 2): ");
                    loket = input.nextInt();
                    input.nextLine();

                    target = (loket == 1) ? loket1 : loket2;

                    if (target.isEmpty()) {

                        System.out.println("Antrian kosong");

                    } else {

                        System.out.println(
                                "Terdepan: "
                                        + target.peek());
                    }

                    break;

                // Tampilkan semua
                case 4:

                    System.out.println("\nLoket 1:");
                    if (loket1.isEmpty())
                        System.out.println("Kosong");
                    else
                        for (Mahasiswa mhs : loket1)
                            System.out.println(mhs);

                    System.out.println("\nLoket 2:");
                    if (loket2.isEmpty())
                        System.out.println("Kosong");
                    else
                        for (Mahasiswa mhs : loket2)
                            System.out.println(mhs);

                    break;

                case 5:

                    System.out.println("Program selesai");

                    break;

                default:

                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 5);

        input.close();
    }
}
