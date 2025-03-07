// Nama FIle    :   AngkaSialException.java
// Deskripsi    :   Eksepsi buatan sendiri, menolak input angka 13.
// Nama / NIM   :   Ivan Pratomo Soelistio / 24060123120011

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan masukkan angka 13 karena angka sial!!!");
    }
}
