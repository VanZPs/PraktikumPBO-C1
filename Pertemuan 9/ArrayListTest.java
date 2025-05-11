// Nama Program     :   ArrayListTest.java
// Deskripsi        :   Program penggunaan objek ArrayList sebagai collection class.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        // Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // Menghapus elemen
        strings.remove("praktikum");

        // Iterasi pada keseluruhan ArrayList
        for (String s: strings) {
            System.out.println(s + " ");
        }
    }
}