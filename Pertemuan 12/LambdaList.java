// Nama Program     :   LambdaList.java
// Deskripsi        :   Implementasi lambda pada list, digunakan sebagai parameter pada method.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 28 Mei 2025

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}