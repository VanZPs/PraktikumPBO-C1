// Nama Program     :   Petani.java
// Deskripsi        :   Implementasi class Petani subclass Manusia.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    
    // ATTRIBUTES
    private String asalKota;
    private static int counterPetani = 0;

    // METHODS
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // GETTER
    public String getAsalKota() {
        return asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // SETTER
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    @Override
    public int hitungMasaKerja() {
        int C = Character.getNumericValue(asalKota.charAt(0));
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now()) + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}