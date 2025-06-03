// Nama :   Ivan Pratomo Soelistio
// NIM  :   24060123120011

package jdbc.service;

/**
 *
 * @author Ivan Pratomo S
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService(){
        this.koneksi = MysqlUtility.getConnection();
    }
    
    // Membuat objek mahasiswa
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama")); 
        return mhs;
    }
    
    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) throws SQLException{
        PreparedStatement s  = koneksi.prepareStatement("INSERT INTO mahasiswa (id, nama) VALUES (?, ?)");
        s.setInt(1,mhs.getId());
        s.setString(2,mhs.getNama());
        s.executeUpdate();
    }
    
    // Update data mahasiswa sesuai id
    public void update(Mahasiswa mhs) throws SQLException{
        PreparedStatement s  = koneksi.prepareStatement("UPDATE mahasiswa SET nama=? WHERE id=?");
        s.setString(1, mhs.getNama());
        s.setInt(2, mhs.getId());
        s.executeUpdate();
    }
    
    // Delete data mahasiswa sesuai id
    public void delete(int id) throws SQLException{
        PreparedStatement s  = koneksi.prepareStatement("DELETE FROM mahasiswa WHERE id=?");
        s.setInt(1, id);
        s.executeUpdate();
    }
    
    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) throws SQLException{
        Mahasiswa mhs = null;
        PreparedStatement s  = koneksi.prepareStatement("SELECT id, nama FROM mahasiswa WHERE id=?");
        s.setInt(1, id);
        ResultSet rs = s.executeQuery();
        if(rs.next()){
            mhs = makeMhsObject(rs);
        }
        return mhs;
    }
    
    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() throws SQLException{
        List<Mahasiswa> listMhs = new ArrayList<>();
        PreparedStatement s  = koneksi.prepareStatement("SELECT * FROM mahasiswa");
        ResultSet rs = s.executeQuery();
        while(rs.next()){
            Mahasiswa mhs = makeMhsObject(rs);
            listMhs.add(mhs);
        }
        return listMhs;
    }
    
    // Reset indeks tabel mahasiswa ke 1
    public void indexReset() throws SQLException{
        PreparedStatement s =  koneksi.prepareStatement("TRUNCATE TABLE mahasiswa");
        s.executeUpdate();
    }
    
    // Memeriksa apakah tabel kosong
    public boolean isEmpty() throws SQLException{
        PreparedStatement s = koneksi.prepareStatement("SELECT 1 FROM mahasiswa LIMIT 1");
        ResultSet rs = s.executeQuery();
        return !rs.next();
    }
    
    // Menutup koneksi ke DB
    public void closeConnection() throws SQLException{
        if (koneksi != null && !koneksi.isClosed()){
            koneksi.close();
        }
    }
}