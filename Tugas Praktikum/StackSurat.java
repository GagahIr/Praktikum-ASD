public class StackSurat {
    Surat10[] stack;
    int top, size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dinilai!");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i >= top; i++) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + stack[i].jenisIzin + stack[i].durasi);
        }
        System.out.println("");
    } 

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampilkanSurat();
                return true;
            }
        }
        return false;
    }  

}
