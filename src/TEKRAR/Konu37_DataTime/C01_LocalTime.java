package TEKRAR.Konu37_DataTime;

import java.time.Duration;
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

 //get...() localTime degerindeki saat dakika,saniye veya nanosaniye bize getirir

        System.out.println(saat.getHour());//17

//bir loop un
// loop un calısma basladıgı ve bittiği zaman arasındaki farkı bulalım

String str="";

LocalTime basalangıc=LocalTime.now();
        for (int i = 0; i < 150000; i++) {

            str+=i;
        }
LocalTime bitis=LocalTime.now();
        System.out.println("saat"+saat);//17:56:42.752212700
        System.out.println("baslangıc"+basalangıc);//17:56:42.752212700
        System.out.println("bitis"+bitis);//17:56:50.938251800

//eger koddaki 2 satırın calısması arasında gecen zamanı bulmak
// isterseniz o iki satırda 2 adet localTime objesi olusturup
// bu zamanlar arasındaki farkı bulmalıyız...

   //1- get metodları ile zaman arasındaki farkı bulabiliriz

        System.out.println(bitis.getSecond()-basalangıc.getSecond());
//tam sureyi belirlemek için
// saat,dakika,saniye ve nanosaniye değişimleri alan bir kod yazılabilir

//2- Duration.between veya toNanoDay ile aradaki farkı bulabilriz

        System.out.println("Duration : "+Duration.between(basalangıc, bitis)); //23
/*
bitis23:04:47.442332800
9
Duration : PT8.7679965S

 */




    }
}
