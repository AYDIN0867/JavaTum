package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

public class C02_SoyisimUpdate extends OgrenciMap {

    public static void main(String[] args) {


     //ogrenci map'inde numarasi ve yeni soyismi verilen ogrencinin
     // eski soyismi yerine yeni soyismi kaydedin


     int ogrenciNo=102;
     String yeniSoyisim="Kaya";


        numaraIleSoyisimUpdate(102,"Kaya");
        numaraIleSoyisimUpdate(103,"Günes");
        numaraIleSoyisimUpdate(104,"Celik");

        System.out.println(ogrenciMap);
//{101=Ali-Can-10-H-MF, 102=Veli-Kaya-10-K-TM, 103=Ali-Günes-11-K-TM, 104=Ayse-Celik-10-H-MF,
// 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

    }
}
