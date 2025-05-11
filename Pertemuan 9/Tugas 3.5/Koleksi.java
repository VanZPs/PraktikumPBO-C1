// Nama Program     :   Koleksi.java
// Deskripsi        :   Kelas generik Koleksi dengan operasi dasar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid.");
        }
    }

    public void setIsi(int index, T elemenBaru) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = elemenBaru;
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid.");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int sizeBaru) {
        if (sizeBaru >= 0 && sizeBaru <= wadah.length) {
            nbelm = sizeBaru;
        } else {
            throw new IllegalArgumentException("Ukuran tidak valid.");
        }
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi sudah penuh.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
        } else {
            throw new IndexOutOfBoundsException("Indeks tidak valid.");
        }
    }

    public void showAll() {
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }
}
