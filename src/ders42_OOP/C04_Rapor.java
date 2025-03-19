package ders42_OOP;

public class C04_Rapor {

    /*

    1-satış bölümdeki satış tutarına dger atasın (wrtite yapsın) ama
    satış tutarına atnamış olan degerleri görememeli (no read)

    2- kullanicilar toplam satış tutarını görüntülüye bilmeli (read) ancak veiler üzerinde değişiklik yapamamlı(no wrtite)

     */

     private double satisTutari; //no read,write
    private double toplamSatisTutari;//read,no write

    public double getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public void setSatisTutari(double satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatisTutari+=satisTutari;
    }



    /*

    write ve read yetkilerini kontrol almak için

    1- öncelikle datalara access modifier ile baska
    classlardan erişilmesini engelle buda private ile olur
     */




}
