// Nama Program     :   DosenTamu.java
// Deskripsi        :   Implementasi class DosenTamu subclass Dosen.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    // ATTRIBUTES
    private String NIDK;
    private LocalDate endKontrak;

    // METHODS
    // Konstruktor
    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate endKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.endKontrak = endKontrak;
    }

    // GETTER
    // Mengembalikan NIDK
    public String getNIDK() {
        return NIDK;
    }

    // Mengembalikan endKontrak
    public LocalDate getEndKontrak() {
        return endKontrak;
    }

    // Mengembalikan tunjangan
    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    // SETTER
    // Men-set NIDK
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    // Men-set endKontrak
    public void setEndKontrak(LocalDate endKontrak) {
        this.endKontrak = endKontrak;
    }

    // Menampilkan info dosen tamu
    @Override
    public void printInfo() {
        System.out.println("NIDK            : " + NIDK);
        super.printInfo();
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Kontrak Habis   : " + endKontrak);
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}