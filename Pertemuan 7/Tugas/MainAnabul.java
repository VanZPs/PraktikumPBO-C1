// Nama Program     :   MainAnabul.java
// Deskripsi        :   Program main untuk menguji class Anabul beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class MainAnabul {
    public static void main(String[] args) {
        Anabul cat = new Kucing("Mengg");
        Anabul dog = new Anjing("Puppy");
        Anabul bird = new Burung("Birdy");

        Hiasan.title();

        cat.Gerak();
        cat.Bersuara();
        Hiasan.separator();

        dog.Gerak();
        dog.Bersuara();
        Hiasan.separator();

        bird.Gerak();
        bird.Bersuara();
        Hiasan.endOfProgram();
    }
}
