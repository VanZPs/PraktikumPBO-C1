// Nama Program     :   MapTest.java
// Deskripsi        :   Program yang menggunakan Generic untuk pasangan Kunci-Nilai.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        // Kunci -> integer, nilai -> String
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(1, "dua");

        // Mengambil elemen pertama
        System.out.println(map.get(1));

        // Mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();

        // Bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
        /*  Untuk mengambil seluruh nilai dari kunci dalam Map di Java, kita bisa menggunakan keySet() dan mengiterasi setiap kunci dengan for-each, 
            lalu memanggil map.get(kunci) untuk mendapatkan nilainya. Namun, cara yang lebih efisien adalah dengan entrySet(), karena kita bisa langsung mengakses 
            pasangan kunci dan nilai tanpa memanggil get() berulang. */
    }
}