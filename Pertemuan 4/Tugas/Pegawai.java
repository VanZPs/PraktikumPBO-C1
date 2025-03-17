// Nama Program     :   Pegawai.java
// Deskripsi        :   Implementasi class Pegawai.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {

    // ATTRIBUTES
    private String NIP;
    private String nama;
    private LocalDate tglLahir;
    private LocalDate TMT;
    private double gajiPokok;

    // METHODS
    // Konstruktor pegawai
    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // GETTER
    // Mengembalikan NIP
    public String getNIP() {
        return NIP;
    }

    // Mengembalikan nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan tglLahir
    public LocalDate getTglLahir() {
        return tglLahir;
    }

    // Mengembalikan TMT
    public LocalDate TMT() {
        return TMT;
    }

    // Mengembalikan Gaji Pokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    // SETTER
    // Men-set NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Men-set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Men-set tglLahir
    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    // Men-set TMT
    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    // Men-set Gaji Pokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Mengembalikan info masa kerja (berupa string tahun dan bulan)
    public String getInfoMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan.";
    }

    // Mengembalikan masa kerja
    // Method untuk mendapatkan masa kerja dalam tahun (integer)
    public int getMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears();
    }
    
    
    // Mengembalikan batas usia kerja
    public LocalDate getBUP(int batasUsia) {
        LocalDate bupDate = tglLahir.plusYears(batasUsia);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonth().plus(1), 1);
    }

    // Buat format tanggal
    public String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
        return date.format(formatter);
    }

    // Menampilkan info pegawai
    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tglLahir));
        System.out.println("TMT             : " + formatDate(TMT));
        System.out.println("Masa Kerja      : " + getInfoMasaKerja());
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }

    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)
    // Menampilkan Title Program
    static void title() {
        System.out.println("\n============== INFORMASI PEGAWAI ==============");
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