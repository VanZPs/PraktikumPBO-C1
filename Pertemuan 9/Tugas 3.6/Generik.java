// Nama Program     :   Generik.java
// Deskripsi        :   Berisi metode generik untuk mengendalikan objek Anabul.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class Generik {
    public static <G extends Anabul> void tampilkanPerilaku(G anabul){
        anabul.Gerak();
        anabul.Bersuara();
    }
}