// Nama FIle    :   Asersi2.java
// Deskripsi    :   Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol.
// Nama / NIM   :   Ivan Pratomo Soelistio / 24060123120011

public class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        Lingkaran l = new Lingkaran(jariJari);
        assert (jariJari > 0): "Jari-jari tidak boleh nol!!!";
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " +kelilingLingkaran);
    }
}

// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.Jelaskan pada lembar laporan praktikum!
// Assertion dalam Java biasanya digunakan untuk debugging dan bukan untuk validasi input.
// satu file hanya boleh ada satu class saja