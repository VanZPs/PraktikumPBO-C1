// Nama Program     :   MManusia.java
// Deskripsi        :   Program main untuk menguji class Manusia beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "1983023206041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2008, 2, 1), "Jl. Air", 55000000, "2000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(2011, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 04, 01), "", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        Manusia.title();
        System.out.println("Jumlah Manusia      = " + Manusia.getCounterMns() + " orang");
        System.out.println("Jumlah PNS          = " + PNS.getCounterPNS() + " orang");
        System.out.println("Jumlah Pengusaha    = " + Pengusaha.getCounterPengusaha() + " orang");
        System.out.println("Jumlah Petani       = " + Petani.getCounterPetani() + " orang");

        Manusia.separator();
        System.out.println("Pajak PNS p1        = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1    = " + pt1.hitungPajak());

        Manusia.separator();
        System.out.println("Masa Kerja p1   = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1  = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1  = " + pt1.hitungMasaKerja());

        Manusia.separator();
        System.out.println("INFORMASI PNS");
        p1.cetakInfo();
        System.out.println("INFORMASI PENGUSAHA");
        pe1.cetakInfo();
        System.out.println("INFORMASI PETANI");
        pt1.cetakInfo();
        Manusia.endOfProgram();
    }
}