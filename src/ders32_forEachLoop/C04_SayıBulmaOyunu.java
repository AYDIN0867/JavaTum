package ders32_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_SayıBulmaOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele bir sayı oluşturun
        //kullanıcılardan herkesin bir sayi tahmin etmesini isteyin
        //girilen sayiları bir liste olak kaydedin
        //kullanıcılar negatif bir sayı girdiğinde
        // olusturulan rastgele sayıyı
        //yapılan tahminleri
        //rast gele sayıya en yakın tahmini yazdırın

        Random random=new Random();
        int tutulansayi= random.nextInt(100);

        int girilenSayi=0; //tahmin edilen sayı ..kaç defa girileceğini bilmedğimiz için while loop ile yapacağız
        List<Integer>tahminlerListesi=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        do {

            System.out.println("lütfen bir tahmin giriniz....\n sonucu görmek için negatif sayı giriniz");
            girilenSayi=scanner.nextInt();

            if (girilenSayi>=0){

                tahminlerListesi.add(girilenSayi);
            }

        }while (girilenSayi>=0);

        //-olusturulan rastgele sayiyi
        System.out.println("Tuttugum sayi :" +tutulansayi);

        //-yapilan tahminler
        System.out.println("Yapilan tahminler listesi : "+ tahminlerListesi);


        int tutulansayıyaEnYakınsayı=tahminlerListesi.get(0);
        int enYakinTahminSayiIleFarkı;

        if (tutulansayıyaEnYakınsayı>tutulansayi){

            enYakinTahminSayiIleFarkı=tutulansayıyaEnYakınsayı-tutulansayi;

        }else {

            enYakinTahminSayiIleFarkı=tutulansayi-tutulansayıyaEnYakınsayı;
        }



        for ( int each
                 :  tahminlerListesi ) {

            int fark;

            if (each>tutulansayi){

                fark=each-tutulansayi;
            }else{

                fark=tutulansayi-each;
            }

            if (fark<enYakinTahminSayiIleFarkı){


                tutulansayıyaEnYakınsayı=each;
                enYakinTahminSayiIleFarkı=fark;

            }


           }

        System.out.println("en yakin tahmin : "+tutulansayıyaEnYakınsayı);



    }
}
