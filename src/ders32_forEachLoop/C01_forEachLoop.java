package ders32_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_forEachLoop {

    public static void main(String[] args) {

        /*
                for each loop gelismiş bir looptur ve bir array veya
        collectiondaki tüm elementleri index veya siralama olmaksizin bize getirir
        avantajaı indekxlere ihtiyac duymadığından kod yazarken hataları azaltır
         */




        int [] arr={3,4,5,2,3,4,5,1,2,3};
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,3,4,5,6,4,5,4,3));

        //arr deki elementlerin toplamını yazdırın

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }

        System.out.println("for loop ile toplam "+toplam);

     for (  int each:  arr ) {

         toplam+=each;

         System.out.println("for each loop ile toplam "+toplam);
        }

       //sayilar listesindeki çift sayıların toplamı

       toplam=0;
        for (int i = 0; i < sayilar.size(); i++) {

           if (sayilar.get(i)%2==0){

               toplam+= sayilar.get(i);
           }

        }

        System.out.println("for loop ile çift sayiların toplamı"+toplam);
        toplam=0;

        for ( Integer each
                 :sayilar   ) {

            if (each%2==0){

                toplam+=each;
            }
           }

        System.out.println(toplam);

        //sayilar listesindeki en büyük elementi yazdırın

        int enBuyukElement=sayilar.get(0);

        for (int i = 0; i < sayilar.size(); i++) {

            if(sayilar.get(i)>enBuyukElement){

                enBuyukElement= sayilar.get(i);
            }

        }

        System.out.println("for loop ile en büyük element"+enBuyukElement);


        enBuyukElement= sayilar.get(0);

        for (int each
                 : sayilar  ) {

            if (each>enBuyukElement){

                enBuyukElement=each;
            }
           }



    }
}
