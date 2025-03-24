// Nama Program     :   BangunDatar.java
// Deskripsi        :   Implementasi class BangunDatar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public abstract class BangunDatar2 {

    // ATTRIBUTES
    // private int jmlSisi;
    // private String warna;
    // private String border;
    // private static int counterBangunDatar = 0;
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // METHODS
    // Konstruktor untuk membuat bangun datar (tanpa parameter)
    public BangunDatar2() {
        counterBangunDatar++;
    }

    // Konstruktor untuk membuat bangun datar (dengan parameter jmlSisi, warna, dan border)
    public BangunDatar2(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter untuk mengembalikan nilai jmlSisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Setter untuk men-set  nilai dari jmlSisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter untuk mengembalikan warna
    public String getWarna() {
        return warna;
    }

    // Setter untuk men-set warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter untuk mengembalikan border
    public String getBorder() {
        return border;
    }

    // Setter untuk men-set border
    public void setBorder(String border) {
        this.border = border;
    }

    // ABSTRACT METHODS
    // Method abstrak getLuas
    public abstract double getLuas();

    // Method abstrak getKeliling
    public abstract double getKeliling();

    // Menampilkan info dari bangun datar yang sudah dibuat
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Menampilkan jumlah objek bangun datar yang sudah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    // Mengecek apakah luas antara dua buah bangun datar sama
    public boolean isEqualLuas(BangunDatar2 X) {
        return this.getLuas() == X.getLuas();
    }

    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)
    // Menampilkan Title Program
    static void title() {
        System.out.println("\n=========== BANGUN DATAR ===========");
        System.out.println("====================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    static void endOfProgram() {
        System.out.println("\n====================================");
        System.out.println("====================================\n");
    }

    // Menampilkan separator (Pembatas output)
    static void separator() {
        System.out.println("\n====================================\n");
    }
}