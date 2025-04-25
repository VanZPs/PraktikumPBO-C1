// Nama Program     :   Hiasan.java
// Deskripsi        :   Interface berisi hiasan untuk output.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public interface Hiasan {
    // Menampilkan Judul
    static void title() {
        System.out.println("\n============== ANABUL ==============");
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
