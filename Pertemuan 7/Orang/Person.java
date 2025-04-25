// Nama Program     :   Person.java
// Deskripsi        :   Implementasi class Person.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 23 April 2025

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }

    public boolean isSleep(int hr) {
        return 22 < hr || 7 > hr;
    }

    public String toString() {
        return name;
    }

    public void status(int hr) {
        if (this.isSleep(hr)) {
            System.out.println("Now offline: " + this);
        } else {
            System.out.println("Now online: " + this);
        }
    }
}