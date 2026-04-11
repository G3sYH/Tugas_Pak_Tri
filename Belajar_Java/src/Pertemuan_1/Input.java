package Pertemuan_1;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.println("Halo, " + nama);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        input.close();
    }
}