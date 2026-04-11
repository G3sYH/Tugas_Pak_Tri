package Pertemuan_1;

public class Luas_Keliling {
    public static void main(String[] args) {
        int p, l, L, K;
        p = 4;
        System.out.println("Panjang     :" + p);

        l = 3;
        System.out.println("Lebar       :" + l);

        System.out.println("Luas persegi panjang : panjang * lebar");
        L = p * l;
        System.out.println("Luas persegi panjang : " + L);

        System.out.println("\nKeliling persegi panjang : 2(panjang + lebar)");
        K = 2 * (p + L);
        System.out.println("Kelling persegi panjang : " + K);
    }
}