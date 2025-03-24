// Nama Program     :   BangunDatar2.java
// Deskripsi        :   Program main untuk menguji class BangunDatar2 beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public class MBangunDatar2 {
    public static void main(String[] args) {
        // Membuat dan menginisialisasi lingkaran, dan persegi
        // BangunDatar B1 = new BangunDatar();
        BangunDatar2 L1 = new Lingkaran(10, "Biru", "Putih");
        BangunDatar2 P1 = new Persegi(4, "kuning", "Hitam");
        Persegi P2 = new Persegi(4, "Merah", "Putih");
        Lingkaran L2 = new Lingkaran(10, "Jingga", "Putih");

        /*PENJELASAN No 3:
         * Terdapat kesalahan pada baris:
         *      BangunDatar B1 = new BangunDatar();
         * Kesalahan ini terjadi karena BangunDatar adalah abstract class, sehingga tidak bisa 
         * diinstansiasi secara langsung. Jika kode dijalankan, akan terjadi error.
         */

        // Menampilkan judul program
        BangunDatar2.title();

        // Menampilkan informasi bangun datar 1
        System.out.println("INFORMASI L1");
        L1.printInfo();
        BangunDatar2.separator();

        // Menampilkan informasi bangun datar 2
        System.out.println("INFORMASI P1");
        P1.printInfo();
        BangunDatar2.separator();

        // Menampilkan informasi Lingkaran
        System.out.println("INFORMASI L2");
        L2.printInfo();
        BangunDatar2.separator();

        // Menampilkan informasi persegi
        System.out.println("INFORMASI P2");
        P2.printInfo();
        BangunDatar2.separator();

        // Menampilkan jumlah bangun datar yang sudah dibuat
        BangunDatar2.printCounterBangunDatar();
        BangunDatar2.endOfProgram();

        /*PERTANYAAN No 5:
         * a. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
              bangun datar yang berbeda?
           b. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
              dan isEqualKeliling pada class BangunDatar? Mengapa?
           c. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?

           PENJELASAN:
           a. Ya, method isEqualLuas() dan isEqualKeliling() dapat digunakan untuk membandingkan luas dan keliling objek BangunDatar 
              yang berbeda bentuk, misalnya membandingkan antara Persegi dan Lingkaran.
           b. Jika BangunDatar bukan abstract class, maka kita harus memberikan implementasi konkret untuk method getLuas() dan getKeliling() di dalamnya. 
              Namun, karena BangunDatar bersifat generik dan luas serta kelilingnya bergantung pada bentuk spesifik (Persegi atau Lingkaran), maka 
              tidak masuk akal untuk memberikan implementasi langsung.
           c. Menjadikan BangunDatar sebagai abstract class mencegah instansiasi langsung, memastikan setiap subclass (Persegi, Lingkaran, dll.) 
              mengimplementasikan method getLuas() dan getKeliling(), serta mempermudah penerapan polimorfisme, di mana referensi BangunDatar dapat digunakan 
              untuk menyimpan berbagai bentuk bangun datar.
         */
    }    
}