// Nama Program     :   Anjing.java
// Deskripsi        :   Implementasi class Anjing.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 30 April 2025

public class Anjing extends Anabul {
    
    // METHODS
    public Anjing(String Nama) {
        super(Nama);
    }

    public void Gerak() {
        System.out.println("Nama Anabul : " + getNama() + "\nGerak       : Melata");
    }

    public void Bersuara() {
        System.out.println("Suara       : Guk guk");
    }
}
