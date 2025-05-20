// Nama Program     :   MySQLPersonDAO.java
// Deskripsi        :   Implementasi PersonDAO untuk MySQL.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Mei 2025

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama db, user, password menyesuaikan
        // class for.name(com.mysql.jbdc.Driver);
        // Bagian ini tidak saya pakai karena saya menggunakan MySQL workbench

        // Bagian ini juga saya ubah untuk menyesuaikan MySQL Workbench
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/pbo", 
            "root", 
            "Ivan17122004");
        
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
