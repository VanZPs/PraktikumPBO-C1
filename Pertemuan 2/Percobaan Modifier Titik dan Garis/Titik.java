// Nama Program     :   Titik.java
// Deskripsi        :   Implementasi class titik.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class Titik {

    // ATTRIBUTES
    private double absis, ordinat;
    private static int counterTitik = 0;

    
    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat titik (0, 0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konsturktor untuk membuat titik dengan nilai absis dan ordinat (x, y)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    // Meng-set nilai absis dengan nilai baru x
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Meng-set nilai ordinat dengan nilai baru y
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik sejauh x dan y
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menampilkan koordinat titik
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Menampilkan nilai counter titik
    public static void printCounterTitik() {
        System.out.println(Titik.counterTitik + " titik.");
    }

    // Mengembalikan posisi kuadran titik
    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    // Mengemblaikan jarak titik dari titik pusat (0, 0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }

    public double jarak(Titik t) {
        return Math.sqrt(Math.pow(t.getAbsis() - this.absis, 2) + Math.pow(t.getOrdinat() - this.ordinat, 2));
    }

    // Merefleksikan sebuah titik terhadap sumbu X
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Merefleksikan sebuah titik terhadap sumbu Y
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Mengembalikan sebuah titik baru yang merupakan hasil refleksi titik terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(getAbsis(), -getOrdinat());
    }

    // Mengembalikan sebuah titik baru yang merupakan hasil refleksi titik terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-getAbsis(), getOrdinat());
    }

    
    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)

    // Mengebalikan titik ke dalam bentuk string (digunakan pada class garis)
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    // Menampilkan Title Program
    public static void title() {
        System.out.println("\n=========== Class Titik ===========");
        System.out.println("===================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    public static void endOfProgram() {
        System.out.println("\n===================================");
        System.out.println("===================================\n");
    }

    // Menampilkan separator (Pembatas output)
    public static void separator() {
        System.out.println("\n===================================\n");
    }
}