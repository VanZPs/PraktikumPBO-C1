// Nama Program     :   MMahasiswa.java
// Deskripsi        :   Main class mahasiswa.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Dosen D1 = new Dosen("123", "Rismiyati", "Informatika");
        Kendaraan K1 = new Kendaraan("H-123-OG", "Sepeda Motor");
        Mahasiswa M1 = new Mahasiswa("24060123120011", "Ivan", "Informatika", D1, K1);
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        Mahasiswa.title();
        M1.printDetailMhs();
        Mahasiswa.separator();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        Mahasiswa.endOfProgram();
    }
}