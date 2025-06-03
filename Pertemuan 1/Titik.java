// Nama Program     :   Titik.java
// Deskripsi        :   Implementasi class titik.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 19 Februari 2025

public class Titik {

    // ATTRIBUTES
    double absis, ordinat;
    static int counterTitik = 0;

    
    // METHODS
    // Konstruktor
    // Konstruktor untuk membuat titik (0, 0)
    Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konsturktor untuk membuat titik dengan nilai absis dan ordinat (x, y)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Setter
    // Meng-set nilai absis dengan nilai baru x
    void setAbsis(double x) {
        this.absis = x;
    }

    // Meng-set nilai ordinat dengan nilai baru y
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik sejauh x dan y
    void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menampilkan koordinat titik
    void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Menampilkan nilai counter titik
    static void printCounterTitik() {
        System.out.println(Titik.counterTitik + " titik.");
    }

    // Mengembalikan posisi kuadran titik
    int getKuadran() {
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
    double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }

    double jarak(Titik t) {
        return Math.sqrt(Math.pow(t.getAbsis() - this.absis, 2) + Math.pow(t.getOrdinat() - this.ordinat, 2));
    }

    // Merefleksikan sebuah titik terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Merefleksikan sebuah titik terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    // Mengembalikan sebuah titik baru yang merupakan hasil refleksi titik terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(getAbsis(), -getOrdinat());
    }

    // Mengembalikan sebuah titik baru yang merupakan hasil refleksi titik terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-getAbsis(), getOrdinat());
    }

    
    // METHODS TAMBAHAN SENDIRI (HIASAN SAJA)

    // Mengebalikan titik ke dalam bentuk string (digunakan pada class garis)
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    // Menampilkan Title Program
    static void title() {
        System.out.println("\n=========== Class Titik ===========");
        System.out.println("===================================\n");
    }

    // Menampilkan Underline (Akhiran output)
    static void endOfProgram() {
        System.out.println("\n===================================");
        System.out.println("===================================\n");
    }

    // Menampilkan separator (Pembatas output)
    static void separator() {
        System.out.println("\n===================================\n");
    }
}