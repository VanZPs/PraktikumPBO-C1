// Nama FIle    :   Asersi1.java
// Deskripsi    :   Program untuk menunjukkan asersi.
// Nama / NIM   :   Ivan Pratomo Soelistio / 24060123120011

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif.");
        } else {
            assert x < 0: "Ada kesalahan kode";
            System.out.println("x bilangan negatif.");
        }        
    }
}