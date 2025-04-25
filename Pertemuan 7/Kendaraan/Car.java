// Nama Program     :   Car.java
// Deskripsi        :   Implementasi class Car.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }

    void sewa() {
        System.out.println("Sewa mobil");
    }
}