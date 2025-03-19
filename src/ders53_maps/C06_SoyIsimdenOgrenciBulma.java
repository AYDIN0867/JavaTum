package ders53_maps;

import java.util.Set;

public class C06_SoyIsimdenOgrenciBulma extends C03_ogrenciMapClassi {

    public static void main(String[] args) {


        // verilen soyisme ogrencilerin
        //ogrenciNo sinif sube ve isimlerini yazdirin

        //1. inci adım :tüm keyleri elde edelim

        Set<Integer> ogrenciKeyset=ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
        // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

        System.out.println("================Soyadı Can Olan ogrenci listesi===========");

       //2. adım tüm keyleri tek tek ele alıp,
        //o keye ait valuyei incelemek için bir loop oluşturalım

        for (Integer eachKey : ogrenciKeyset) {

            //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
            //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey);

            //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
            //bir array olarak kaydederiz

            String [] eachValueArr   =eachValue.split("-"); //[Ali,Can,10,H,MF]

            //5. adım artık istenen görevi yapalım;
            // // verilen soyisme ogrencilerin
            //        //ogrenciNo sinif sube ve isimlerini yazdirin

            if (eachValueArr[1].equalsIgnoreCase("can")){

                System.out.println(eachKey+" "+eachValueArr[2]+" "+eachValueArr[3]+" "+eachValueArr[0]);
                //101 10 H Ali
                //104 10 H Ayse
                //106 10 K Sevgi
            }

        }



    }






    }
