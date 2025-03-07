// Nama FIle    :   ExceptiomOnArray.java
// Deskripsi    :   Program penggunaan eksepsi menggunakan class library java.
// Nama / NIM   :   Ivan Pratomo Soelistio / 24060123120011

public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
