// Nama Program     :   BangunDatarGenericTest2.java
// Deskripsi        :   Main class untuk generic bangun datar Persegi, Persegi Panjang dan Segitiga.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 7 Mei 2025

public class BangunDatarGenericTest2 {
    public static void main(String[] args) {
        
        // Uji Persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(persegi);
        System.out.println("Keliling persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas persegi: " + bdgPersegi.get().hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getName() + "\n");

        // Uji Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<PersegiPanjang>();
        bdgPP.set(pp);
        System.out.println("Keliling persegi panjang: " + bdgPP.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdgPP.get().hitungLuas());
        System.out.println("Tipe generic: " + bdgPP.get().getClass().getName() + "\n");

        // Uji Segitiga
        Segitiga segitiga = new Segitiga(3, 4, 5, 3, 4);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(segitiga);
        System.out.println("Keliling segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas segitiga: " + bdgSegitiga.get().hitungLuas());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getName() + "\n");
    }
}
