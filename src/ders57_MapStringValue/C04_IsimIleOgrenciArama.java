package ders57_MapStringValue;

import java.util.Set;

public class C04_IsimIleOgrenciArama extends OgrenciMap{


    public static void main(String[] args) {

        //verilen isme sahip ogrencilerin
        //numara,sinif,sube,isim ve soyisimlerini yazdıran bir method olusturun
        String verilenIsim="Ali";
        //1- tum keyleri kaydederiz
        //ogrenciMap.keySet() method'u Set olarak tum keyleri getirir

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();
        //2- bir foor-each loop ile her bir key i ele alalım
        System.out.println("ismi: "+ verilenIsim+ " olan ogrenci listesi");
        for ( Integer eachKey
                 :  ogrenciKeySeti ) {

            //3- each'in getirdiği key e ait valueye kaydedelim

            String eachValue=ogrenciMap.get(eachKey);

            //4- value'yu split ile bolup bir array olarak kaydedelim ki bilgilere direk ulaşalım

            String [] eachValueArr=eachValue.split("-");


            if (eachValueArr[0].equalsIgnoreCase(verilenIsim)){

                System.out.println(

                  eachKey+" "+
                  eachValueArr[2]+" "+
                  eachValueArr[3]+" "+
                  eachValueArr[0]+" "+
                  eachValueArr[1]


//ismi: Aliolan ogrenci listesi
//101 10 H Ali Can
//103 11 K Ali Cem


                );



            }




           }








        //5- kaydettiğimiz valueArr'inde istenen bilgiyi kontrol edip
        //istenen sarti saglayan ogrencilerin, istenen bilgilerii yazdırın








    }

}
