package TEKRAR.Konu37_DataTime;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

     /*
     Time ve date ile ilgili obje oluştutrurken java
     sıfırdan obje oluturulamsına izin vermez...
     zamanı ve tarihi bilgisayardan alacağı için bazı ön ayarları
     yapması gerekir...

     Java kendisi bize tarih yada zamanı alıp return edcek hazır metodlar
     hazırlamıştır bizde klas da zaman ve tarih objesi oluştudugunuzda degeri o metodlardan alırız

      */

        System.out.println(saat);
//17:47:29.585916300

 //get...() localTime degerindeki saat dakika,saniye veya nanosaniye bizegetiri

        System.out.println(saat.getHour());//17

//bir loop un
// loop un calısma basladıgı ve bittiği zaman arasındaki farkı bulalım

String str="";

        for (int i = 0; i < 150000; i++) {

            str+=i;
        }

        System.out.println(saat);//17:51:25.287195100


    }
}
