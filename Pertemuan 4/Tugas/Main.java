// Nama Program     :   Main.java
// Deskripsi        :   Program main untuk menguji class Pegawai beserta subclassnya.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Maret 2025

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
            "24060123120011", "Ivan", LocalDate.of(2004, 12, 17), LocalDate.of(2015, 1, 1),
            8000000, "Fakultas Sains dan Matematika", "78512345");

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "24060123120008", "Vino",
            LocalDate.of(2004, 12, 7), LocalDate.of(2020, 3, 1),
            6000000, "Fakultas Teknik", "78541236", LocalDate.of(2026, 3, 10)
        );

        // Membuat objek Tendik
        Tendik tendik = new Tendik(
            "24060123130117", "Julius",
            LocalDate.of(2005, 7, 17), LocalDate.of(2010, 5, 20),
            5000000, "Sosial"
        );

        // Menampilkan informasi pegawai
        Pegawai.title();

        dosenTetap.printInfo();
        Pegawai.separator();

        dosenTamu.printInfo();
        Pegawai.separator();

        tendik.printInfo();
        Pegawai.endOfProgram();
    }
}
