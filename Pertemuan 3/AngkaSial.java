public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);   
        } catch(AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati masukkan angka!!!");
        }
    }
}

/*PERTANYAAN:
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jelaskan pada lembar praktikum anda !*/

// Ketika eksepsi terjadi, maka baris ke 12 tidak akan tereksekusi karena kondisi eksepsi terpenuhi sehingga angkaSialException dithrow sebelum mencapai baris 12.