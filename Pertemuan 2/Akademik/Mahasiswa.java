// Nama Program     :   Mahasiswa.java
// Deskripsi        :   Implementasi class mahasiswa.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

import java.util.ArrayList;

public class Mahasiswa {
    
    // ATTRIBUTES
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat dan mengisi data mahasiswa default
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>(); // Inisialisasi ArrayList kosong
    }

    // Konstruktor untuk membuat dan mengisi data mahasiswa dengan nim, nama, prodi, dosenwali, kendaraan, dan listMatKul
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        this.listMatKul = new ArrayList<>(); // Inisialisasi ArrayList kosong
    }

    // Membuat list MatKul yang diambil mahasiswa
    public void addMatKul(MataKuliah newMatkul) {
        listMatKul.add(newMatkul);
    }

    // Getter
    // Mengembalikan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // Mengembalikan total jumlah SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSKS();
        }
        return totalSKS;
    }

    // Setter
    // Men-set dosenWali dengan nilai dosenWali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Men-set kendaraan dengan nilai kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menampilkan detail informasi mahasiswa
    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen wali: " + dosenWali);
        System.out.println("Kendaraan: " + kendaraan);
        
        System.out.println("\nMatkul yang diambil:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("- " + listMatKul.get(i).getNama());
        }
    }

    // Menampilkan Title Program
    static void title() {
        System.out.println("\n=========== Program Akademik ===========");
        System.out.println("========================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    static void endOfProgram() {
        System.out.println("\n========================================");
        System.out.println("========================================\n");
    }

    // Menampilkan separator (Pembatas output)
    static void separator() {
        System.out.println("\n========================================\n");
    }
}