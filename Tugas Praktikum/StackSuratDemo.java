import java.util.Scanner;

public class StackSuratDemo {
    public static void main(String[] args) {
        StackSurat stack = new StackSurat(5);
        int pilih;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (I/S): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat10 surat = new Surat10(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat Izin %s berhasil dimasukkan\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        if (diproses != null) {
                            System.out.println("Memproses surat:");
                            diproses.tampilkanSurat();
                        }
                    }
                    break;
                case 3:
                    Surat10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat Izin terakhir:");
                        lihat.tampilkanSurat();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (!ditemukan) {
                        System.out.println("Surat izin tidak ditemukan.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 5);
    }
}
