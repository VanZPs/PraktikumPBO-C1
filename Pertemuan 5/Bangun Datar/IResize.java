// Nama Program     :   IResize.java
// Deskripsi        :   Implementasi interface iResize.
// Nama / NIM       :   Ivan Pratomo Soelistio / 24060123120011
// Tanggal          :   Jumat, 21 Maret 2025

public interface IResize {
    public void zoomIn();
    public void zoomOut();
    public void zoom(int percent);
}

/*PERTANYAAN:
 Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
 dibanding dijadikan sebagai abstract method dalam class BangunDatar?

 *PENJELASAN:
 Mengemas method zoomIn(), zoomOut(), dan zoom() dalam interface IResize lebih menguntungkan dibanding menjadikannya abstract 
 method dalam class BangunDatar, karena memberikan fleksibilitas tinggi dalam desain program. Dengan menggunakan interface, kemampuan 
 resize dapat diterapkan pada berbagai class tanpa harus menjadikannya bagian dari hierarki BangunDatar, memungkinkan reuse pada class lain
 yang tidak berhubungan langsung dengan bangun datar. Selain itu, interface mendukung multiple inheritance, sehingga suatu class dapat
 meng-extend BangunDatar sekaligus mengimplementasikan IResize tanpa terbatas pada satu superclass.
*/