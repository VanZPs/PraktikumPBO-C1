// Nama Program     :   Main.java
// Deskripsi        :   Program main untuk menguji class Anabul beserta subclassnya menggunakan generik Koleksi.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>(10);
        Random rand = new Random();
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            int pilihan = rand.nextInt(3);
            switch (pilihan) {
                case 0:
                    KoleksiAnabul.add(new Kucing("Kucing-" + (i+1)));
                    break;
                case 1:
                    KoleksiAnabul.add(new Anjing("Anjing-" + (i+1)));
                    break;
                case 2:
                    KoleksiAnabul.add(new Burung("Burung-" + (i+1)));
                    break;
            }
        }
        KoleksiAnabul.showAll();
    }
}
