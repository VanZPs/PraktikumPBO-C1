// Nama Program     :   MBangunDatar.java
// Deskripsi        :   Program main untuk menguji class BangunDatar beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat dan menginisialisasi bangun datar, lingkaran, dan persegi
        BangunDatar bd1 = new BangunDatar();
        BangunDatar bd2 = new BangunDatar(5, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        Persegi p = new Persegi(4, "kuning", "Hitam");

        // Menampilkan judul program
        BangunDatar.title();

        // Menampilkan informasi bangun datar 1
        System.out.println("Informasi BangunDatar 1:");
        bd1.printInfo();
        BangunDatar.separator();

        // Menampilkan informasi bangun datar 2
        System.out.println("Informasi BangunDatar 2:");
        bd2.printInfo();
        BangunDatar.separator();

        // Menampilkan informasi Lingkaran
        System.out.println("Informasi Lingkaran:");
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());
        BangunDatar.separator();

        // Menampilkan informasi persegi
        System.out.println("Informasi Persegi:");
        p.printInfo();
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());
        BangunDatar.separator();

        // Menampilkan jumlah bangun datar yang sudah dibuat
        BangunDatar.printCounterBangunDatar();
        BangunDatar.endOfProgram();
    }
}