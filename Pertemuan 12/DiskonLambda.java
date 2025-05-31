// Nama Program     :   DiskonLambda.java
// Deskripsi        :   Ekspresi lambda dasar, digunakan untuk menghitung diskon.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 28 Mei 2025

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }

// Dapatkah anda membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan?
/* Kode tersebut bisa dijalankan tanpa masalah, dan kalau kita perhatikan, cara penulisan diskonLebaran dan diskonBiasa memang berbeda walaupun 
   keduanya pakai lambda. diskonLebaran ditulis simpel dalam satu baris, langsung menghitung dan mengembalikan hasil tanpa perlu tanda kurung 
   kurawal atau kata return. Sementara itu, diskonBiasa pakai cara yang lebih lengkap—ada blok {} dan perintah return, mirip seperti nulis fungsi 
   biasa. Jadi intinya, Java kasih kita fleksibilitas: kalau logikanya sederhana, cukup satu baris, tapi kalau butuh lebih kompleks, 
   bisa pakai blok kode.*/
}