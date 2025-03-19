package ders53_maps;

import java.util.Set;

public class C07_Update extends C03_ogrenciMapClassi {

    public static void main(String[] args) {

        //ogrenci msp deki 101 numaralı ogrencinin bilgilerini
        //"Fadime-Cem-11-L-say" olarak güncelleyin

        //eger tüm value verilirse guncellmem için put veya replace kullanılır

        //ogrenciMap.put(101,"Fadime-Cem-11-L-say");
        ogrenciMap.replace(101,"Fadime-Cem-11-L-say");

        System.out.println(ogrenciMap); //101=Fadime-Cem-11-L-say
//10 K sinifindaki ögrencilerin siniflarini 10/z olsun

//1. inci adım :tüm keyleri elde edelim

        Set<Integer> ogrenciKeyset=ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
        // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

        //2. adım tüm keyleri tek tek ele alıp,
        //o keye ait valuyei incelemek için bir loop oluşturalım
        for (Integer eachKey : ogrenciKeyset) {

            //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
            //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey);

            //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
            //bir array olarak kaydederiz

            String[] eachValueArr = eachValue.split("-"); //[Ali,Can,10,H,MF]

            //5. adım artık istenen görevi yapalım;
            //10 K sinifindaki ögrencilerin siniflarini 10/z olsun

            if (eachValueArr[2].equals("10")&&eachValueArr[3].equals("K")){

                eachValueArr[3]="Z";
            }

            //VALUE İÇİNDEKİ BİR BÖLÜMÜ UPDATE etmek istediğimizde 5. adıma kadar herşey aynı ancak bu adımdan sonra
            //array deyaptığımız bu update yi map e işlememiz gerekiyor...

            //6. adım arrayi value olarak kullnamak yeniden bir string haline getirelim



            String yeniValue=String.join("-",eachValueArr);

            //7. adım eachKey ile yeniValueyş update yapalım

            ogrenciMap.replace(eachKey,yeniValue);


        }

        System.out.println(ogrenciMap);

        //{101=Fadime-Cem-11-L-say, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}
        //{101=Fadime-Cem-11-L-say, 102=Veli-Cem-10-Z-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-Z-MF, 107=Esra-Han-11-M-SOZ}
//değişim burda...veli cem artık 10 z de
    }
}
