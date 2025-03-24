public class Lingkaran extends BangunDatar2 implements IResize {

    // ATTRIBUTES
    private double jari;

    // METHODS
    // Konstruktor untuk membuat lingkaran (tanpa parameter)
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor untuk membuat lingkaran dengan parameter (diameter, warna, dan border)
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    // Getter untuk mengembalikan nilai jari2
    public double getJari() {
        return jari;
    }

    // Setter untuk men-set nilai jari2
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Implementasi interface IResize
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

    // Mengembalikan luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * Math.pow(jari, 2);
    }

    // Mengembalikan keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + getJari());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}