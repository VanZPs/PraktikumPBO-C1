// Nama Program     :   Vehicle.java
// Deskripsi        :   Implementasi class Vehicle.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }

    void sewa() {
        System.out.println("Sewa kendaraan");
    }
}