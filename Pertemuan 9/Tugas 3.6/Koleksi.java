// Nama Program     :   Koleksi.java
// Deskripsi        :   Kelas generik Koleksi Anabul.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025


public class Koleksi<T extends Anabul> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Anabul[kapasitas];
        nbelm = 0;
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh!");
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            Generik.tampilkanPerilaku(wadah[i]);
            System.out.println("---------------------------");
        }
    }
}
