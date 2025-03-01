// Nama Program     :   Kendaraan.java
// Deskripsi        :   Implementasi class kendaraan.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class Kendaraan {

    // ATTRIBUTES
    private String noPlat;
    private String jenis;

    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat dan mengisi data kendaraan default
    public Kendaraan() {
        this.noPlat = " ";
        this.jenis = " ";
    }

    // Konstruktor untuk membuat dan mengisi data kendaraan dengan noPlat dan jenis
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter
    // Mengembalikan noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // Mengembalikan jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    // Setter
    // Men-set noPlat dengan nilai noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Men-set jenis dengan nilai jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return noPlat + " - " + jenis;
    }    
}