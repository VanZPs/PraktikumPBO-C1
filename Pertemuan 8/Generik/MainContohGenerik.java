// Nama Program     :   MainAnabul.java
// Deskripsi        :   Program main untuk menguji class Anabul beserta subclassnya menggunakan ContohMetodeGenerik.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 30 April 2025

public class MainContohGenerik {
    public static void main(String[] args) {
        Datum<Anjing> dataAnjing = new Datum<>(); 
        Datum<Kucing> dataKucing = new Datum<>(); 
        Datum<Burung> dataBurung = new Datum<>();
        
        dataAnjing.setIsi(new Anjing("Fur"));
        dataKucing.setIsi(new Kucing("Hilmi"));
        dataBurung.setIsi(new Burung("Hawks"));
        
        Hiasan.title();

        ContohMetodeGenerik.tampilkanPerilaku(dataAnjing);
        Hiasan.separator();

        ContohMetodeGenerik.tampilkanPerilaku(dataKucing);
        Hiasan.separator();

        ContohMetodeGenerik.tampilkanPerilaku(dataBurung);
        Hiasan.endOfProgram();
    }
}
