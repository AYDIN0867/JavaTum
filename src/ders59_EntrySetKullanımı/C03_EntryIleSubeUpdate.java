package ders59_EntrySetKullanımı;

import ders57_MapStringValue.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C03_EntryIleSubeUpdate extends OgrenciMap {

    public static void main(String[] args) {

        //Entry kullanarak,11/M sinifindaki ogrencileri
        //11/T olarak guncelleyin


        System.out.println(ogrenciMap);
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

            if (eachValueArr[2].equalsIgnoreCase("11")&&eachValueArr[3].equalsIgnoreCase("M")){

                eachValueArr[3]="T";
            }

            //6. adım arrayde yaptığımız değişikliği map de update etmek için
            //arrayi yeni value olarak birleştirelim

            eachEntry.setValue(String.join("-",eachValueArr));


        }

        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-T-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-T-SOZ}

    }
}
