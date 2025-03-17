// Nama Program     :   Tendik.java
// Deskripsi        :   Implementasi class Tendik subclass Pegawai.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;

public class Tendik extends Pegawai {

    // ATTRIBUTES
    private String bidang;

    // METHODS
    // Konstruktor
    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    // GETTER
    // Mengembalikan bidang
    public String getBIdang() {
        return bidang;
    }

    // SETTER
    // Men-set bidang
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Mengembalikan tunjangan
    public double getTunjangan() {
        return 0.01 * getMasaKerja() * getGajiPokok();
    }

    // Menampilkan info tendik
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("BUP             : " + getBUP(55));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}