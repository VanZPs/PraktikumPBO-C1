// Nama Program     :   Kucing.java
// Deskripsi        :   Implementasi class Kucing.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Kucing extends Anabul {

    // METHODS
    public Kucing(String Nama) {
        super(Nama);
    }

    public void Gerak() {
        System.out.println("Nama Anabul : " + getNama() + "\nGerak       : Melata");
    }

    public void Bersuara() {
        System.out.println("Suara       : Meong");
    }
}
