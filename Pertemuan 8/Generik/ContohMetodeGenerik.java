// Nama Program     :   ContohMetodeGenerik.java
// Deskripsi        :   Berisi metode generik untuk mengendalikan objek Datum.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 30 April 2025

public class ContohMetodeGenerik {
    public static <G extends Anabul> void tampilkanPerilaku(Datum<G> data){
        G Anabul = data.getIsi();
        Anabul.Gerak();
        Anabul.Bersuara();
    }
}