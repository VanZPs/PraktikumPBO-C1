// Nama Program     :   Student.java
// Deskripsi        :   Implementasi class Student.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isSleep(int hr) {
        return 2 < hr && 8 > hr;
    }
}
