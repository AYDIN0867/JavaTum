package TEKRAR.Konu30_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


// For each loop (enhanced) gelişmiş bir foor looptur
// bir array veya Collection daki  TUM ELEMENTLERI index veya sıralama
// OLMAKSIZIN bize getirir....index KULLANMAZ
 //indekslerden kaynaklanan hataları azaltır
 //indeks kullanmadığı için sıralama gereken işlemlerde kullanılmaz...


int  [] arr ={3,4,5,2,3,4,5,1,2,3};

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,3,4,5,6,4,5,4,3));

  //arr deki elementlerin toplmını yazdırın

  int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];


        }

        System.out.println("for loop ile arr deki elementlerin toplmı"+ toplam);

toplam=0;

for(int each:arr){

    toplam+=each;
}


        System.out.println("for each loop ile toplam "+ toplam);
//for each loop ile toplam 32

        //sayılar listesindeki çift sayıların toplamı
toplam=0;
        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)%2==0){

                toplam+=sayilar.get(i);
            }

        }

        System.out.println("for loop ile çift sayılar toplamı"+ toplam);

        toplam=0;

       for(int each:sayilar){

           if (each%2==0){

               toplam+=each;

           }
       }

        System.out.println("for each loop ile listedeki çift sayıların toplamı" +toplam);


       //sayılar lsitesindeki en buyuk  elementi yazdırın

        int enBuyukElement=Integer.MIN_VALUE;
//int enBuyukElement=sayilar.get(0);

        for(int each:sayilar){

            if (each>enBuyukElement){

                enBuyukElement=each;
            }

        }

        System.out.println("en buyuk element "+ enBuyukElement);


        /*

        1-for loop baslangıc ve bitis biliniyorsa, yani tekrar sayısı biliniyorsa

        2- while loop tekrar sayısı belli değilse

        3- do-while looop
        loop bodysi en az bir defa çalışssın isteniyorsa
        yani kullnaıcıdan alınanda hata olmasını istemiyorum denirse

        4- for each loop birden fazla eleman barındıran yapılardaki
        TUM ELEMENTLER SIRALAMA OLMAKSIZIN (index kullanmadan) bize getirir

        spesifik bir kullanım icin oluşturulmuştur
        ama o kullanımda çok idealdir...



         */


    }
}
