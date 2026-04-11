package Pertemuan_7;

public class Linked_List {

    static class ServerNode {
        String nama;
        int capacity;
        int currentLoad;
        boolean isOverloaded;
        ServerNode prev, next;

        ServerNode(String n, int cap) {
            this.nama = n;
            this.capacity = cap;
            this.currentLoad = 0;
            this.isOverloaded = false;
        }
    }

    static class LoadBalancer {

        ServerNode head, tail;
        ServerNode lastServed;
        int totalServer;

        // Tambah server ke Circular Doubly Linked List
        public void tambahServer(String nama, int cap) {

            ServerNode baru = new ServerNode(nama, cap);

            if (head == null) {

                head = tail = baru;
                baru.next = baru;
                baru.prev = baru;

            } else {

                baru.prev = tail;
                baru.next = head;

                tail.next = baru;
                head.prev = baru;

                tail = baru;
            }

            totalServer++;

            if (lastServed == null)
                lastServed = head;
        }

        // Hitung jumlah digit
        private int hitungDigit(int n) {

            if (n == 0)
                return 1;

            int count = 0;
            n = Math.abs(n);

            while (n > 0) {
                count++;
                n /= 10;
            }

            return count;
        }

        // ===============================
        // TODO 1: DISTRIBUTE (Skip-N RR)
        // ===============================

        public void distribute(int[] requestIds) {

            for (int req : requestIds) {

                int skip = hitungDigit(req);

                ServerNode current = lastServed;

                // Skip N server
                for (int i = 0; i < skip; i++) {
                    current = current.next;
                }

                boolean assigned = false;
                int checked = 0;

                // Cari server yang masih punya kapasitas
                while (checked < totalServer) {

                    if (current.currentLoad < current.capacity) {

                        current.currentLoad++;

                        lastServed = current;

                        assigned = true;

                        break;
                    }

                    current = current.next;
                    checked++;
                }

                if (!assigned) {

                    System.out.println(
                            "REQUEST[" + req +
                                    "] DITOLAK: SEMUA SERVER PENUH");
                }
            }
        }

        // ===============================
        // TODO 2: HEALTH CHECK
        // ===============================

        public void healthCheck() {

            ServerNode current = tail;

            do {

                double persen = (double) current.currentLoad
                        / current.capacity;

                if (persen > 0.8) {

                    current.isOverloaded = true;

                } else {

                    current.isOverloaded = false;
                }

                current = current.prev;

            } while (current != tail);
        }

        // ===============================
        // TODO 3: REBALANCE
        // ===============================

        public void rebalance() {

            ServerNode current = head;

            do {

                if (current.isOverloaded) {

                    int pindah = current.currentLoad / 2;

                    ServerNode neighbor = current.next;

                    int space = neighbor.capacity
                            - neighbor.currentLoad;

                    int transfer = Math.min(pindah, space);

                    current.currentLoad -= transfer;

                    neighbor.currentLoad += transfer;

                    current.isOverloaded = false;
                }

                current = current.next;

            } while (current != head);
        }

        // Cetak status server
        public void cetakStatus(String label) {

            System.out.println("== " + label + " ==");

            ServerNode c = head;

            do {

                String flag = c.isOverloaded ? " [OVERLOADED]" : "";

                System.out.println(
                        "  " + c.nama +
                                " load=" + c.currentLoad +
                                "/" + c.capacity +
                                flag);

                c = c.next;

            } while (c != head);
        }
    }

    // ===============================
    // MAIN PROGRAM
    // ===============================

    public static void main(String[] args) {

        LoadBalancer lb = new LoadBalancer();

        lb.tambahServer("SRV-Alpha", 10);
        lb.tambahServer("SRV-Beta", 8);
        lb.tambahServer("SRV-Gamma", 12);
        lb.tambahServer("SRV-Delta", 6);
        lb.tambahServer("SRV-Epsilon", 15);

        lb.cetakStatus("STATUS AWAL");

        int[] requests = {

                101, 5, 2048, 77, 999,
                12345, 42, 8, 314, 7777,

                50, 3, 100, 88888, 1,
                666, 9999, 200, 55, 4,

                10001, 73, 6, 512, 2
        };

        System.out.println("\n== DISTRIBUSI 25 REQUESTS ==");

        lb.distribute(requests);

        lb.cetakStatus("\nSTATUS SETELAH DISTRIBUSI");

        System.out.println("\n== HEALTH CHECK ==");

        lb.healthCheck();

        lb.cetakStatus("STATUS SETELAH HEALTH CHECK");

        System.out.println("\n== REBALANCE ==");

        lb.rebalance();

        lb.cetakStatus("STATUS SETELAH REBALANCE");
    }
}