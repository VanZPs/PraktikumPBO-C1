// Nama Program     :   Main.java
// Deskripsi        :   Aplikasi untuk menguji kelas Koleksi dengan 10 karakter
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);
        koleksiChar.add('A');
        koleksiChar.add('B');
        koleksiChar.add('C');
        koleksiChar.add('D');

        koleksiChar.showAll();

        koleksiChar.setIsi(2, 'Z');
        koleksiChar.showAll();

        koleksiChar.delete(1);
        koleksiChar.showAll();

        koleksiChar.add('E');
        koleksiChar.add('F');
        koleksiChar.add('G');
        koleksiChar.add('H');
        koleksiChar.add('I');
        koleksiChar.add('J');
        koleksiChar.add('K');
        koleksiChar.showAll();
    }
}
