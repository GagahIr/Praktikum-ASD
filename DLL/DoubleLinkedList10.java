package DLL;

import Pertemuan12.NodeMahasiswa10;

public class DoubleLinkedList10 {
    Node10 head;
    Node10 tail;

    DoubleLinkedList10() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void addFirst(Mahasiswa10 data) {
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa10 data) {
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String keyNim, Mahasiswa10 data) {
        Node10 current = head;

        // Cari node dengan nim - keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node10 newNode = new Node10(data);

        // Jika current adalah tail, cukup tembahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setekah NIM " + keyNim);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node10 current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            head.data.tampilInformasi();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            head.data.tampilInformasi();
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            tail.data.tampilInformasi();
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            tail.data.tampilInformasi();
            tail = tail.prev;
            tail.next = null;
        }
    }

    Node10 search(String nim) {
        Node10 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void add(int index, Mahasiswa10 data) {
        if (index < 0) {
            System.out.println("Indeks salah.");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node10 temp = head;
            int i = 0;
            while (temp != null && i < index - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi jumlah elemen.");
            } else if (temp.next == null) {
                addLast(data);
            } else {
                Node10 newNode = new Node10(data);
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }

    void removeAfter(String keyNim) {
        Node10 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node yang bisa dihapus setelah NIM tersebut.");
            return;
        }

        Node10 toDelete = current.next;
        current.next = toDelete.next;

        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toDelete.data.tampilInformasi();
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node10 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi jumlah data.");
        } else {
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println("Data pada indeks " + index + " berhasil dihapus:");
                current.data.tampilInformasi();
            }
        }
    }

    Mahasiswa10 getFirst() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }

    Mahasiswa10 getLast() {
        if (!isEmpty()) {
            return tail.data;
        }
        return null;
    }

    Mahasiswa10 getIndex(int index) {
        if (index < 0 || isEmpty()) {
            return null;
        }
        Node10 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current != null) {
            return current.data;
        }
        return null;
    }

    int getSize() {
        int count = 0;
        Node10 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
