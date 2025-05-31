// Nama Program     :   LambdaMhs.java
// Deskripsi        :   sebuah program yang digunakan untuk menampilkan key dan value dari sebuah Map,
//                      dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi lambda.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 28 Mei 2025

import java.util.HashMap;
import java.util.Map;

public class LambdaMhs {
    public static void main(String[] args) {
        Map<String,String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060123120008", "Vino");
        mahasiswa.put("24060123120011", "Ivan");
        mahasiswa.put("24060123120020", "Solkhan");
        mahasiswa.put("24060123130117", "Julius");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println(nim + ", " + nama);
        });
    }
}
