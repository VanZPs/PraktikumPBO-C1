// Nama Program     :   DAOManager.java
// Deskripsi        :   Pengelola DAO dalam program.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Rabu, 14 Mei 2025

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
