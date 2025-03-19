package ders59_EntrySetKullanımı;

import ders57_MapStringValue.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C04_EntryIleSoyısimGuncelleme extends OgrenciMap {
    public static void main(String[] args) {
//görev:Tum ogrencilerin soyIsmini buyuk harf yapın


        //1. adım Enrty set olustur

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();

        //2. adım bir for each loop ile tüm Entryleri gözden gecir

        for ( Map.Entry<Integer,String> eachEntry
                :ogrenciEntrySeti   ) {


            // 3. adım ogrenci vluesini kaydedelim

            String eachValue= eachEntry.getValue();


            //4. adım valuedeki bilgilee erişmel için split ederiz

            String [] eachValueArr=eachValue.split("-");

            //5. adım istenen kontrolleri yapıp istenen bilgileri update edin
            ////görev:Tum ogrencilerin soyIsmini buyuk harf yapın

        eachValueArr[1]= eachValueArr[1].toUpperCase();


            //6. adım arrayde yaptığımız değişikliği map de update etmek için
            //arrayi yeni value olarak birleştirelim

            eachEntry.setValue(String.join("-",eachValueArr));


        }

        System.out.println(ogrenciMap);

//{101=Ali-CAN-10-H-MF, 102=Veli-CEM-10-K-TM, 103=Ali-CEM-11-K-TM,
// 104=Ayse-CAN-10-H-MF, 105=Sevgi-CEM-11-M-TM, 106=Sevgi-CAN-10-K-MF, 107=Esra-HAN-11-M-SOZ}







    }
}
