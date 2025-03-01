// Nama Program     :   Dosen.java
// Deskripsi        :   Implementasi class dosen.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class Dosen {

    // ATTRIBUTES
    private String nip, nama, prodi;

    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat dan mengisi data dosen default
    public Dosen() {
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    }

    // Konstruktor untuk membuat dan mengisi data dosen dengan NIP, nama, dan prodi dosen
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter
    // Mengembalikan nip
    public String getNIP() {
        return nip;
    }

    // Mengembalikan nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan prodi
    public String getProdi() {
        return prodi;
    }

    // Setter
    // Men-set nip dengan nilai nip
    public void setNIP(String nip) {
        this.nip = nip;
    }

    // Men-set nama dengan nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Men-set prodi dengan nilai prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return nama + ", NIP: " + nip + ", Prodi: " + prodi;
    }
    
}