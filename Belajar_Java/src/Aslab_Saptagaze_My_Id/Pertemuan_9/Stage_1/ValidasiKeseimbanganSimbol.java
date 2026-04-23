package Aslab_Saptagaze_My_Id.Pertemuan_9.Stage_1;

public class ValidasiKeseimbanganSimbol {

    static String[] buffer = new String[5];

    static int front = 0;
    static int rear = 0;
    static int size = 0;

    static int totalMasuk = 0;
    static int totalDrop = 0;
    static int totalProses = 0;

    // ENQUEUE
    public static boolean enqueue(String id) {

        if (isFull()) {
            totalDrop++;
            return false;
        }

        buffer[rear] = id;

        rear = (rear + 1) % buffer.length;

        size++;

        totalMasuk++;

        return true;
    }

    // DEQUEUE
    public static String dequeue() {

        if (isEmpty())
            return null;

        String data = buffer[front];

        front = (front + 1) % buffer.length;

        size--;

        totalProses++;

        return data;
    }

    // CEK FULL
    public static boolean isFull() {
        return size == buffer.length;
    }

    // CEK EMPTY
    public static boolean isEmpty() {
        return size == 0;
    }

    // TAMPILKAN STATUS
    public static void tampilkanStatus(String label) {

        System.out.println("\n[" + label + "]");

        System.out.println(
                "size=" + size +
                        " | Masuk=" + totalMasuk +
                        " Drop=" + totalDrop +
                        " Proses=" + totalProses);

        System.out.print("Isi Queue: ");

        if (isEmpty()) {
            System.out.println("(kosong)");
            return;
        }

        int i = front;

        for (int count = 0; count < size; count++) {

            System.out.print(buffer[i] + " ");

            i = (i + 1) % buffer.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Masukkan 8 paket
        for (int i = 1; i <= 8; i++) {

            boolean ok = enqueue("PKT-" + i);

            if (!ok)
                System.out.println("DROP: PKT-" + i);
        }

        tampilkanStatus("Setelah masukkan 8 paket");

        // Proses 3 paket
        dequeue();
        dequeue();
        dequeue();

        tampilkanStatus("Setelah proses 3 paket");

        // Tambah 4 paket
        for (int i = 9; i <= 12; i++) {
            enqueue("PKT-" + i);
        }

        tampilkanStatus("Setelah masukkan 4 paket lagi");
    }
}