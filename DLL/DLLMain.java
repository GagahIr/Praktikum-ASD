package DLL;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList10 list = new DoubleLinkedList10();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa:");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    list.removeFirst();
                }
                case 4 -> {
                    list.removeLast();
                }
                case 5 -> {
                    list.print();
                }
                case 6 -> {
                    System.out.println("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node10 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan");
                        found.data.tampilInformasi();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah data ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks untuk menyisipkan data: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM yang akan dihapus setelahnya: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks data yang ingin dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 11 -> {
                    Mahasiswa10 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama:");
                        first.tampilInformasi();
                    } else {
                        System.out.println("Linked list kosong.");
                    }
                }
                case 12 -> {
                    Mahasiswa10 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data terakhir:");
                        last.tampilInformasi();
                    } else {
                        System.out.println("Linked list kosong.");
                    }
                }
                case 13 -> {
                    System.out.print("Masukkan indeks data yang ingin ditampilkan: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa10 data = list.getIndex(index);
                    if (data != null) {
                        System.out.println("Data pada indeks " + index + ":");
                        data.tampilInformasi();
                    } else {
                        System.out.println("Data tidak ditemukan pada indeks tersebut.");
                    }
                }
                case 14 -> {
                    System.out.println("Jumlah data dalam Linked List: " + list.getSize());
                }
                case 0 -> {
                    System.out.println("Keluar dari program.");
                }
                default -> {
                    System.out.println("Data tidak ditemukan.");
                }
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa10 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa10(nim, nama, kelas, ipk);
    }
}
