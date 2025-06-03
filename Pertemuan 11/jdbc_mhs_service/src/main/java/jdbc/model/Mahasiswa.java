// Nama :   Ivan Pratomo Soelistio
// NIM  :   24060123120011

package jdbc.model;

/**
 *
 * @author Ivan Pratomo S
 */
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor tanpa parameter
    public Mahasiswa() {
        this.id = 0;
        this.nama = "";
    }

    // Constructor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter untuk id
    public int getId() {
        return id;
    }

    // Setter untuk id
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Override toString
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama='" + nama + "'}";
    }
}

