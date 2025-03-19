package ders53_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_SinifSubeListeleme extends C03_ogrenciMapClassi{

    //11/k sinifindaki ogrencilerin
    //numara isim ve soy ismini liste olarak yazdırın

    public static void main(String[] args) {


        Set<Integer> ogrenciKeyset = ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106, 107]
        // System.out.println(ogrenciKeyset); //[101, 102, 103, 104, 105, 106, 107]

//2. adım tüm keyleri tek tek ele alıp,
        //o keye ait valuyei incelemek için bir loop oluşturalım

        System.out.println("================11 K subesindeki öğrenciler===========");

        for (Integer eachKey : ogrenciKeyset) {

            //3. adim: eachKey bize tek tek her bir ogrenci numaarasını getirir
            //bizim o ögrenci numarasına ait valueyi kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey); //101=Ali-Can-10-H-MF

            //4. adım valueyi bir bütün olarak kaydettik ismi kontrol için önce - ile split edip
            //bir array olarak kaydederiz

            String[] eachValueArr = eachValue.split("-"); //[Ali,Can,10,H,MF]

            //5. adım artık istenen işlemi yapabiliriz
            //ogrenci mapinde ismi Ali olan ogrencilerin
            //isism soyisim ve siniflairni liste olarak yazın

            if (eachValueArr[2].equalsIgnoreCase("11")&&eachValueArr[3].equalsIgnoreCase("K")) {

                System.out.println(eachKey+" "+eachValueArr[0]+" "+eachValueArr[1]); //103 Ali Cem
            }


        }





    }


    }