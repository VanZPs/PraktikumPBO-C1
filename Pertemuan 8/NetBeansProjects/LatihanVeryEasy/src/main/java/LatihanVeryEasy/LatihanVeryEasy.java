// Nama Program     :   LatihanVeryEasy.java
// Deskripsi        :   Program main untuk menguji class Senjata.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 30 April 2025

package latihanVeryEasy;

public class LatihanVeryEasy {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}