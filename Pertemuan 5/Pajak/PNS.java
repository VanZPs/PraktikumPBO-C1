// Nama Program     :   PNS.java
// Deskripsi        :   Implementasi class PNS subclass Manusia.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    
    // ATTRIBUTES
    private String nip;
    private static int counterPNS = 0;

    // METHODS
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // GETTER
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // SETTER
    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        int A = Character.getNumericValue(nip.charAt(14));
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}
