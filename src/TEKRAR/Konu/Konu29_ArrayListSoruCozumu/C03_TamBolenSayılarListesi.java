package TEKRAR.Konu.Konu29_ArrayListSoruCozumu;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenSayılarListesi {
    public static void main(String[] args) {

        System.out.println(tambolenSayilar(6));//[1, 2, 3, 6]
        System.out.println(tambolenSayilar(50));//[1, 2, 5, 10, 25, 50]


        // Verilen pozitif bir tamsayıyı,
        // tam bolebilen tum pozitif tamsayıları bir liste olarak bize donduren
        //bir metod olusturun...


        /*
        tamnolenSayilar method 'unu kullnarak 2 basamaklı
        asal sayilari yazdirin......
         */


        for (int i = 10; i <100 ; i++) {

            int tamBolenSayısı=tambolenSayilar(i).size();

            if (tamBolenSayısı==2){

                System.out.println(i+ " ");
            }

        }

    }


    public static List<Integer>tambolenSayilar(int sayi){
        List<Integer>tamBolenListe=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                tamBolenListe.add(i);
            }

        }



        return tamBolenListe;
    }
}
