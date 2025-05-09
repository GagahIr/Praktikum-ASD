package TugasPraktikumKRS;
public class MahasiswaKRS {
    String nim, nama, prodi, kelas;

    MahasiswaKRS(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }


    MahasiswaKRS(){

    }

    void tampilData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
