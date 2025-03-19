package ders53_maps;

public class C05_HazırMethodlarıKullanma {


    public static void main(String[] args) {

   //ismi sevgi olan öğrencilerin isim soy isim ve siniflarini listele olarak yazdırın

   C03_ogrenciMapClassi.isimListesiYazdir("sevgi");
//SevgiCem 11
 //SevgiCan 10

 C03_ogrenciMapClassi.isimListesiYazdir("veli");//VeliCem 10

C04_SinifSubeListeleme.sinifSubeyaz("10","K");
//102 Veli Cem
//106 Sevgi Can

        C04_SinifSubeListeleme.sinifSubeyaz("11","K");
        //103 Ali Cem

        //soyisimden diğer bilgilere ulaşan method

        C03_ogrenciMapClassi.soyIsimdenOgrenciBulma("can");

//================Soyadı can Olan ogrenci listesi===========
//101 10 H Ali
//104 10 H Ayse
//106 10 K Sevgi




    }
}
