// Nama Program     :   Garis.java
// Deskripsi        :   Implementasi class garis.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class Garis {

    // ATTRIBUTES
    private Titik awal, akhir;
    private static int counterGaris = 0;


    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat garis dengan titik awal (0, 0) dan titik akhir (1, 1)
    public Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor untuk membuat garis dengan titik awal dan titik akhir bernilai awal dan akhir
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Getter
    // Mengembalikan nilai awal garis
    public Titik getAwal() {
        return awal;
    }

    // Mengembalikan nilai akhir garis
    public Titik getAkhir() {
        return akhir;
    }

    // Meng-set nilai awal dengan nilai baru awal
    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    // Meng-set nilai akhir dengan nilai baru akhir
    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // Mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mengembalikan panjang garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - awal.getOrdinat(), 2));
    }
    
    // Mengembalikan gradien garis
    public double getGradien() {
        if (akhir.getAbsis() == awal.getAbsis()) {
            throw new ArithmeticException("Garis vertikal tidak memiliki gradien");
        }
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    // Mengembalikan sebuah titik yang merupakan titik tengah dari sebuah garis
    public Titik getTitikTengah() {
        double tengahX = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double tengahY = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Mengecek apakah dua buah garis sejajar
    public boolean isSejajar(Garis G) {
        if ((this.akhir.getAbsis() - this.awal.getAbsis()) == 0 || (G.akhir.getAbsis() - G.awal.getAbsis()) == 0) {
            return (this.akhir.getAbsis() - this.awal.getAbsis()) == (G.akhir.getAbsis() - G.awal.getAbsis());
        } else {
            return this.getGradien() == G.getGradien();
        }
    }

    // Mengecek apakah dua buah garis saling tegak lurus
    public boolean isTegakLurus(Garis G) {
        if ((this.akhir.getAbsis() - this.awal.getAbsis()) == 0) { 
            return (G.akhir.getOrdinat() - G.awal.getOrdinat()) == 0;
        } else if ((G.akhir.getAbsis() - G.awal.getAbsis()) == 0) { 
            return (this.akhir.getOrdinat() - this.awal.getOrdinat()) == 0;
        } else {
            return this.getGradien() * G.getGradien() == -1;
        }
    }

    // Menampilkan titik awal dan titik akhir dari garis
    public void tampilkanGaris() {
        System.out.println("dari " + getAwal() + " ke " + getAkhir());
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaanGaris() {
        if (akhir.getAbsis() == awal.getAbsis()) { 
            return "Garis vertikal: x = " + awal.getAbsis();
        } else {
            double m = getGradien();
            double c = awal.getOrdinat() - (m * awal.getAbsis());
            return "y = " + m + "x + " + c;
        }
    }


    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)

    // Menampilkan Title Program
    public static void title() {
        System.out.println("\n=============== Class Garis ===============");
        System.out.println("===========================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    public static void endOfProgram() {
        System.out.println("\n===========================================");
        System.out.println("===========================================\n");
    }

    // Menampilkan separator (Pembatas output)
    public static void separator() {
        System.out.println("\n===========================================\n");
    }

    // Menampilkan jeda/space kosong satu baris
    public static void space() {
        System.out.println("");
    }
}