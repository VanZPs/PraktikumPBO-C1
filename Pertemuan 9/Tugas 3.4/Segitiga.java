// Nama Program     :   Segitiga.java
// Deskripsi        :   Implementasi Segitiga sebagai BangunDatar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA, sisiB, sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC, double alas, double tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
