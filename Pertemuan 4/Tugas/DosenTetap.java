// Nama Program     :   DosenTetap.java
// Deskripsi        :   Implementasi class DosenTetap subclass Dosen.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;

public class DosenTetap extends Dosen {

    // ATTRIBUTES
    private String NIDN;

    // METHODS
    // Konstruktor
    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    // GETTER
    // Mengembalikan NIDN
    public String getNIDN() {
        return NIDN;
    }

    // Mengembalikan tunjangan
    public double getTunjangan() {
        return 0.02 * getMasaKerja() * getGajiPokok();
    }

    // SETTER
    // Men-set NIDN
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    // Menampilkan info dosen tetap
    @Override
    public void printInfo() {
        System.out.println("NIDN            : " + NIDN);
        super.printInfo();
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("BUP             : " + getBUP(65));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}
