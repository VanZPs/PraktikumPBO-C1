// Nama Program     :   BangunDatarGenericTest.java
// Deskripsi        :   Main class untuk generic bangun datar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Tipe generic: " + bdg.get().getClass().getName());
    }
}
