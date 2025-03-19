package ders59_EntrySetKullanımı;

import ders57_MapStringValue.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C02_EntrySinifUpdate extends OgrenciMap {

    public static void main(String[] args) {

        //11. sinifdaki ogrencileri 12. sinif yapın

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

          if (eachValueArr[2].equalsIgnoreCase("11")){

              eachValueArr[2]="12";
          }

          //6. adım arrayde yaptığımız değişikliği map de update etmek için
            //arrayi yeni value olarak birleştirelim

            eachEntry.setValue(String.join("-",eachValueArr));


        }

        System.out.println(ogrenciMap);







    }

}
