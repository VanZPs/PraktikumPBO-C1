// Nama Program     :   Persegi.java
// Deskripsi        :   Implementasi class Persegi subclass dari BangunDatar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public class Persegi extends BangunDatar {

    // ATTRIBUTES
    private double sisi;

    // METHODS
    // Konstruktor untuk membuat persegi (tanpa parameter)
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor untuk membuat persegi dengan parameter (sisi, warna, dan border)
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /*Jika menggunakan yang seperti ini :
    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }
     Penjelasan simple Inheritance: tidak akan bisa karena jmlSisi, warna, dan border
     adalah atribut private dalam class BangunDatar yang hanya bisa diakses langsung
     di class BangunDatar saja, dan jika ingin mengubah maka harus
     menggunakan method public untuk mutatornya yang ada pada class BangunDatar
     untuk mengubahnya.
     
     Penjelasan Access Modifier Protected: jika attribut pada bangun datar diberi access modifier protected, maka attribut pada class Bangundatar
     bisa digunakan pada class Persegi karena class Persegi merupakan turunan dari class BangunDatar.*/

    // Getter untuk mengembalikan nilai sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk men-set nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Mengembalikan luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Mengembalikan keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    // Menampilkan info dari persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar() {
    //     super.printCounterBangunDatar();
    //     System.out.println("Jumlah persegi: " + counterPersegi);
    // } 
    /*Static method tidak bisa di override karena static method dipanggil menggunakan class, dan bukan dari instance objek. */
}