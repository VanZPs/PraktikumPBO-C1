// Nama Program     :   Burung.java
// Deskripsi        :   Implementasi class Burung.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Burung extends Anabul {
    
    // METHODS
    public Burung(String Nama) {
        super(Nama);
    }

    public void Gerak() {
        System.out.println("Nama Anabul : " + getNama() + "\nGerak       : Terbang");
    }

    public void Bersuara() {
        System.out.println("Suara       : Cuit");
    }
}
