package Pertemuan_5.H_DELETE_PENGHAPUSAN_ELEMEN;

public class DeleteArray {

    public static void main(String[] args) {

        int[] data = { 10, 20, 30, 40, 50 };
        int indexHapus = 3;

        for (int i = indexHapus; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        System.out.println("Array setelah delete:");

        int jumlah = 0;

        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + " ");
            jumlah++;
        }

        System.out.println("\nJumlah elemen setelah delete = " + jumlah);
    }
}
