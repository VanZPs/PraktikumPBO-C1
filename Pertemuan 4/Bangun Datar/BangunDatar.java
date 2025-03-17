// Nama Program     :   BangunDatar.java
// Deskripsi        :   Implementasi class BangunDatar.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

public class BangunDatar {

    // ATTRIBUTES
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    // protected private int jmlSisi;
    // protected private String warna;
    // protected private String border;
    // protected private static int counterBangunDatar = 0;

    // METHODS
    // Konstruktor untuk membuat bangun datar (tanpa parameter)
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor untuk membuat bangun datar (dengan parameter jmlSisi, warna, dan border)
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = warna;
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