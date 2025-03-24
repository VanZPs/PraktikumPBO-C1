// Nama Program     :   Manusia.java
// Deskripsi        :   Implementasi class Manusia.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

import java.time.LocalDate;

public abstract class Manusia {

    // ATTRIBUTES
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    // METHODS
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // GETTER
    public String getNama() {
        return nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double pendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // ABSTRACT METHODS
    public abstract int hitungMasaKerja();
    public abstract double hitungPajak();

    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + pendapatan);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak() + "\n");
    }

    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)
    // Menampilkan Title Program
    static void title() {
        System.out.println("\n============== PERHITUNGAN PAJAK ==============");
        System.out.println("===============================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    static void endOfProgram() {
        System.out.println("\n===============================================");
        System.out.println("===============================================\n");
    }

    // Menampilkan separator (Pembatas output)
    static void separator() {
        System.out.println("\n===============================================\n");
    }
}