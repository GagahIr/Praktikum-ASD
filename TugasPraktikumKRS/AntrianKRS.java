package TugasPraktikumKRS;

public class AntrianKRS {
    MahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDilayani;

    AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDilayani = 0;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void tambahAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswaKRS");
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    void layaniMahasiswa() {
        if (size < 2) {
            System.out.println("Minimal harus ada 2 mahasiswa untuk diproses.");
            return;
        }
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Melakukan proses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
            mhs.tampilData();
        }
    }

    void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < Math.min(2, size); i++) {
                int idx = (front + i) % max;
                data[idx].tampilData();
            }
        }
    }

    void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terakhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar MahasiswaKRS dalam antrin: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilData();
        }
    }

    int getJumlahAntrian() {
        return size;
    }

    void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("MahasiswaKRS Terkahir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }

    
    int getJumlahDilayani() {
        return jumlahDilayani;
    }

    int getSisaBelumDilayani() {
        return 30 - jumlahDilayani;
    }

}
