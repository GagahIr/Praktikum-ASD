package TugasPraktikumKRS;

import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa (2 Orang)");
            System.out.println("3. Lihat 2 Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Cetak Jumlah Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("7. Cetak Jumlah Sudah Dilayani");
            System.out.println("8. Cetak Sisa Mahasiswa Belum Dilayani");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniMahasiswa();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa sudah diproses: " + antrian.getJumlahDilayani());
                    break;
                case 8:
                    System.out.println("Sisa mahasiswa belum diproses: " + antrian.getSisaBelumDilayani());
                    break;
                case 9:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian masih kosong");
                    } else {
                        antrian.clear();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
