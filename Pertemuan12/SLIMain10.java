package Pertemuan12;

import java.util.Scanner;

public class SLIMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Scanner sc = new Scanner(System.in);
        // int pilihan;
        Mahasiswa10 mhs1 = new Mahasiswa10("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa10 mhs2 = new Mahasiswa10("23212201", "Bimon", "2B", 3.8);
        Mahasiswa10 mhs3 = new Mahasiswa10("22212202", "Cintia", "3C", 3.5);
        Mahasiswa10 mhs4 = new Mahasiswa10("21212203", "Dirga","4D",3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        // MODIFIKASI SOAL
        // do {
        //     System.out.println("\nMenu:");
        //     System.out.println("1. Tambah data di awal");
        //     System.out.println("2. Tambah data di akhir");
        //     System.out.println("3. Tambah data setelah nama tertentu");
        //     System.out.println("4. Tambah data di indeks tertentu");
        //     System.out.println("5. Tampilkan semua data");
        //     System.out.println("0. Keluar");
        //     System.out.print("Pilih menu: ");
        //     pilihan = sc.nextInt();
        //     sc.nextLine();

        //     switch (pilihan) {
        //         case 1:
        //             Mahasiswa10 mhsAwal = inputMahasiswa(sc);
        //             sll.addFirst(mhsAwal);
        //             break;
        //         case 2:
        //             Mahasiswa10 mhsAkhir = inputMahasiswa(sc);
        //             sll.addLast(mhsAkhir);
        //             break;
        //         case 3:
        //             System.out.print("Masukkan nama setelah data ingin disisipkan: ");
        //             String key = sc.nextLine();
        //             Mahasiswa10 mhs = inputMahasiswa(sc);
        //             sll.insertAfter(key, mhs);
        //             break;
        //         case 4:
        //             System.out.print("Masukkan indeks: ");
        //             int index = sc.nextInt();
        //             sc.nextLine();
        //             Mahasiswa10 mhsIdx = inputMahasiswa(sc);
        //             sll.insertAt(index, mhsIdx);
        //             break;
        //         case 5:
        //             sll.print();
        //             break;
        //         case 0:
        //             System.out.println("Terima kasih");
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak valid.");
        //             break;
        //     }
        // } while (pilihan != 0);
    }

    // public static Mahasiswa10 inputMahasiswa(Scanner sc) {
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan IPK: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine();
    //     return new Mahasiswa10(nim, nama, kelas, ipk);
    // }
}
