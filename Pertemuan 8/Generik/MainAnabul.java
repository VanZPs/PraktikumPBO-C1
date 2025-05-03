// Nama Program     :   MainAnabul.java
// Deskripsi        :   Program main untuk menguji class Anabul beserta subclassnya menggunakan generik Datum.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 30 April 2025

public class MainAnabul {
    public static void main(String[] args) {
        Datum<Anabul> dataKucing = new Datum<>();
        Datum<Anabul> dataAnjing = new Datum<>();
        Datum<Anabul> dataBurung = new Datum<>();

        dataKucing.setIsi(new Kucing("Mengg"));
        dataAnjing.setIsi(new Anjing("Puppy"));
        dataBurung.setIsi(new Burung("Birdy"));

        Hiasan.title();

        dataKucing.getIsi().Gerak();
        dataKucing.getIsi().Bersuara();
        Hiasan.separator();

        dataAnjing.getIsi().Gerak();
        dataAnjing.getIsi().Bersuara();
        Hiasan.separator();

        dataBurung.getIsi().Gerak();
        dataBurung.getIsi().Bersuara();
        Hiasan.endOfProgram();
    }
}
