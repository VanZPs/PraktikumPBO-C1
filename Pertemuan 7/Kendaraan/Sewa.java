// Nama Program     :   Sewa.java
// Deskripsi        :   Program main untuk menguji class Vehicle beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);


    }
    
    static void hitungSewa(Vehicle v) {
        v.sewa();
    }    
}
