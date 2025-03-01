// Nama Program     :   MataKuliah.java
// Deskripsi        :   Implementasi class Mata Kuliah.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class MataKuliah {

    // ATTRIBUTES
    private String idMatKul, nama;
    private int sks;

    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat dan mengisi data mata kuliah default
    public MataKuliah() {
        this.idMatKul = " ";
        this.nama = " ";
        this.sks = 0;
    }

    // Konstruktor untuk membuat dan mengisi data dosen dengan NIP, nama, dan prodi dosen
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter
    // Mengembalikan idMatKul
    public String getIDMatKul() {
        return idMatKul;
    }

    // Mengembalikan nama matkul
    public String getNama() {
        return nama;
    }

    // Mengembalikan sks
    public int getSKS() {
        return sks;
    }

    // Setter
    // Men-set idMatKul dengan nama idMatKul
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // Men-set nama dengan nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Men-set sks dengan nilai sks
    public void setSKS(int sks) {
        this.sks = sks;
    }
}
