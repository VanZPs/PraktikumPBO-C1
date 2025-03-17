// Nama Program     :   Dosen.java
// Deskripsi        :   Implementasi class Dosen subclass Pegawai.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;

public class Dosen extends Pegawai {

    // ATTRIBUTES
    private String fakultas;

    // METHODS
    // Konstruktor
    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    // GETTER
    // Mengembalikan fakultas
    public String getFakultas() {
        return fakultas;
    }

    // SETTER
    // Men-set fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Menampilkan info dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
    }
}