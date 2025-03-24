// Nama Program     :   Pengusaha.java
// Deskripsi        :   Implementasi class Pengusaha subclass Manusia.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    
    // ATTRIBUTES
    private String npwp;
    private static int counterPengusaha = 0;

    // METHODS
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // GETTER
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // SETTER
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        int B = Character.getNumericValue(npwp.charAt(13));
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + B;
    }

    @Override 
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}