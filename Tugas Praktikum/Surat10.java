public class Surat10 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat10() {

    }

    Surat10(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanSurat() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        if (jenisIzin == 'S') {
            System.out.println("Jenis Izin     : Sakit");
        } else if (jenisIzin == 'I') {
            System.out.println("Jenis Izin     : Izin");
        }
        // System.out.println("Jenis Izin     : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi         : " + durasi + " hari");
    }
}
