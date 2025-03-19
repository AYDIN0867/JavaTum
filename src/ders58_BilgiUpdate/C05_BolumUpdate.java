package ders58_BilgiUpdate;

import ders57_MapStringValue.OgrenciMap;

import java.util.Set;

public class C05_BolumUpdate extends OgrenciMap {

    public static void main(String[] args) {

    //ogrenci map inde tum ogrencileri gozden gecirip
    // verilen eskiBolum bilgisine sahip olanlari
    //yeniBölüm olarak update edin

    String eskiBolum="TM";
    String yeniBolum="EA";

        //1- tum key'leri kaydederiz
        //ogrenciMap.keySet () method u Set olarak tum key'leri getirir

        Set<Integer> ogrenciKeySet= OgrenciMap.ogrenciMap.keySet();

        //2-bir for-each loop ile her bir key i ele alalım

        for ( int eachkey
                 :  ogrenciKeySet ) {

            //3-each 'in getirdiği key'e ait valueyi kaydedelim
        String eachValue=ogrenciMap.get(eachkey);

            //4- value'yu split ile bolup

            String [] eachValueArr=eachValue.split("-");

            //ogrenci map inde tum ogrencileri gozden gecirip
            // verilen eskiBolum bilgisine sahip olanlari
            //yeniBölüm olarak update edin
            //     101=Ali-Can-10-H-MF,

            if(eachValueArr[4].equalsIgnoreCase(eskiBolum)){

              eachValueArr[4]=yeniBolum;
            //map de güncellleme yapmak için tekrar birleştiriyoruz

            String yenidenBirleşenValue=String.join("-",eachValueArr);

            ogrenciMap.put(eachkey,yenidenBirleşenValue);




            }






        }


        System.out.println(ogrenciMap);



    }
}
