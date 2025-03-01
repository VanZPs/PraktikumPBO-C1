// Nama Program     :   MTitik.java
// Deskripsi        :   Main class untuk menguji class titik.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 26 Februari 2025

public class MTitik {
    public static void main(String[] args) {
        // Membuat dan mengisi titik
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);
        Titik T3 = new Titik();
        Titik T4 = new Titik();

        // Mengisi nilai absis dan ordinat titik T1
        T1.setAbsis(3);
        T1.setOrdinat(4);

        // Menampilkan judul program
        Titik.title();

        // Menampilkan titik T1
        System.out.println("MENAMPILKAN KOORDINAT TITIK");
        System.out.println("Titik T1");
        T1.printTitik();

        // Menampilkan titik T2
        System.out.println("Titik T2");
        T2.printTitik();
        Titik.separator();

        // Menampilkan jumlah titik yang ada
        // System.out.println("Jumlah titik yang ada: " + Titik.getCounterTitik() + " titik.\n");
        System.out.println("MENAMPILKAN JUMLAH TITIK YANG ADA");
        System.out.println("Jumlah titik yang ada: ");
        Titik.printCounterTitik();
        Titik.separator();

        // Menampilkan posisi kuadran T2
        System.out.println("MENAMPILKAN POSISI KUADRAN T2");
        System.out.println("T2 berada di kuadran-" + T2.getKuadran());
        Titik.separator();

        // Menghitung jarak T1 ke titik pusat (0, 0)
        System.out.println("MENGHITUNG JARAK T1 KE TITIK PUSAT");
        System.out.println("Jarak T1 ke titik pusat = " + T1.getJarakPusat());
        Titik.separator();

        // Menghitung Jarak T1 ke T2
        System.out.println("MENGHITUNG JARAK T1 KE T2");
        System.out.println("Jarak titik T1 ke T2 = " + T1.jarak(T2));
        Titik.separator();

        // Membuat T3 sebagai titik baru yang merupakan refleksi dari T2 terhadap sumbu X
        System.out.println("REFLEKSI T2 TERHADAP SUMBU X");
        System.out.println("Titik T2:");
        T2.printTitik();
        T3 = T2.getRefleksiX();
        System.out.println("Hasil refleksi terhadap sumbu X:");
        T3.printTitik();
        Titik.separator();

        // Membuat T4 sebagai titik baru yang merupakan refleksi dari T2 terhadap sumbu Y
        System.out.println("REFLEKSI T2 TERHADAP SUMBU Y");
        System.out.println("Titik T2:");
        T2.printTitik();
        T4 = T2.getRefleksiY();
        System.out.println("Hasil refleksi terhadap sumbu Y:");
        T4.printTitik();
        Titik.endOfProgram();
    }
}