// Nama :   Ivan Pratomo Soelistio
// NIM  :   24060123120011

package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author Ivan Pratomo S
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) throws SQLException {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // === insert ===
        System.out.println("=== insert ===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();

        // === update ===
        System.out.println("=== update ===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dianya");
        System.out.println("Dengan data baru : " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // === delete ===
        System.out.println("=== delete ===");
        System.out.println("Akan di delete : " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    // Method tambahan untuk menampilkan semua data mahasiswa
    public static void displayAll() throws SQLException {
        List<Mahasiswa> allMhs = service.getAll();
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : allMhs) {
            System.out.println(m);
        }
        System.out.println();
    }
}
