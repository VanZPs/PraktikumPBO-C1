// Nama Program     :   Lingkaran.java
// Deskripsi        :   Implementasi class Lingkaran subclass dari BangunDatar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public class Lingkaran extends BangunDatar {

    // ATTRIBUTES
    private double jari;

    // METHODS
    // Konstruktor untuk membuat lingkaran (tanpa parameter)
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor untuk membuat lingkaran dengan parameter (diameter, warna, dan border)
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    // Getter untuk mengembalikan nilai jari2
    public double getJari() {
        return jari;
    }

    // Setter untuk men-set nilai jari2
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Mengembalikan luas lingkaran
    public double getLuas() {
        return Math.PI * Math.pow(jari, 2);
    }

    // Mengembalikan keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}