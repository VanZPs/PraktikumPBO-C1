// Nama Program     :   MGaris.java
// Deskripsi        :   Main class untuk menguji class garis.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class MGaris {
    public static void main(String[] args) {
        // Membuat dan mengisi Titik
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Titik T3 = new Titik(0, 0);
        Titik T4 = new Titik(4, 2);

        // Membuat garis baru
        Garis G1 = new Garis();
        Garis G2 = new Garis();

        // Men-set titik awal dan akhir dengan titik yg sudah dibuat
        G1.setAwal(T1);
        G1.setAkhir(T2);
        G2.setAwal(T3);
        G2.setAkhir(T4);

        // Menampilkan judul program
        Garis.title();

        // GARIS G1
        System.out.println("GARIS G1");
        G1.tampilkanGaris();
        Garis.space();

        // Menentukan panjang dari garis G1 
        System.out.println("Panjang garis: " + G1.getPanjang());

        // Menentukan gradien dari garis G1
        System.out.println("Gradien garis: " + G1.getGradien());

        // Menentukan titik tengah dari garis G1
        System.out.println("Titik tengah garis: " + G1.getTitikTengah());

        // Menentukan persamaan garis G1
        System.out.println("Persamaan garis: " + G1.getPersamaanGaris());
        Garis.separator();


        // GARIS G2
        System.out.println("GARIS G2");
        G2.tampilkanGaris();
        Garis.space();

        // Menentukan panjang dari garis G2 
        System.out.println("Panjang garis: " + G2.getPanjang());

        // Menentukan gradien dari garis G2
        System.out.println("Gradien garis: " + G2.getGradien());

        // Menentukan titik tengah dari garis G2
        System.out.println("Titik tengah garis: " + G2.getTitikTengah());

        // Menentukan persamaan garis G2
        System.out.println("Persamaan garis: " + G2.getPersamaanGaris());
        Garis.separator();

        // Menampilkan jumlah garis yang sudah dibuat
        System.out.println("MENAMPILKAN JUMLAH GARIS YANG SUDAH DIBUAT");
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris() + "garis");
        Garis.separator();

        // MENGECEK HUBUNGAN ANTARA KEDUA GARIS
        // Mengecek apakah garis G1 dan G2 sejajar
        System.out.println("HUBUNGAN ANTARA KEDUA GARIS");
        System.out.print("Apakah G1 sejajar dengan G2?\n");
        if (G1.isSejajar(G2)) {
            System.out.println("Ya, garis tersebut sejajar.");
        } else {
            System.out.println("Tidak, garis tersebut tidak sejajar.");
        }
        Garis.space();

        // Mengecek apakah garis G1 dan G2 saling tegak lurus
        System.out.print("Apakah G1 tegak lurus dengan G2?\n");
        if (G1.isTegakLurus(G2)) {
            System.out.println("Ya, garis tersebut tegak lurus.");
        } else {
            System.out.println("Tidak, garis tersebut tidak tegak lurus.");
        }
        Garis.endOfProgram();
    }
}