// Nama :   Ivan Pratomo Soelistio
// NIM  :   24060123120011

package jdbc.utilities;

/**
 *
 * @author Ivan Pratomo S
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Sesuaikan host, port, nama database
                String url = "jdbc:mysql://localhost:3307/pbo";

                // Sesuaikan username dan password
                String user = "root";
                String password = "Ivan17122004";

                koneksi = DriverManager.getConnection(url, user, password);

                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}

