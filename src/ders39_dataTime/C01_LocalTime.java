package ders39_dataTime;

import java.time.Duration;
import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {


        //bilgisayardaki localtime yazınız

        //LocalTime saat=new LocalTime();
        /*


        java kendisi tarih veya zamanı return edecek methodlar hazırlamıştır

        bizde class'imızda zaman veya tarih objesi oluşturuduğumuzda değeri o methodlardan alacağız
         */

       LocalTime saat=LocalTime.now();

        System.out.println(saat); //09:02:01.571778

        System.out.println(saat.getHour());//9

        //bir loop oluşturup
        // loop un calişmaya başladığı zaman ile bittiği zaman arasındaki farkı bulun
        LocalTime baslangic=LocalTime.now();
        String str="";

        for (int i = 0; i < 100000; i++) {

            str+=i;

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(saat);
        //09:06:37.624864200
        //9
      //  09:06:37.624864200

        System.out.println("baslangic :"+baslangic);//baslangic :09:13:33.071353600
        System.out.println("bitis :"+bitis);//bitis :09:13:43.435865300

     /*

    LocalTime class i obje oluşturdugumuz satir caliştiğında
    çalıştığı sistemdeki zaman bilgisini alır

    oluşturulan localTime objesi bir kronometre değil
    oluşturduğu andaki degeri saklayan basit bir variabledir

    Eger koddaki 2 satırın calışması arasında gecen zamanı bulmak isterseniz o
     iki satırda 2 adet localtime oluşturup bu zamanlar arasındaki farkı buluruz


      */

        // 1- get methodları ile zaman arasındaki farkı bulabiliriz...
        System.out.println(bitis.getSecond()-baslangic.getSecond());//-51


        //2-Duration.between() ile baslangic ve bitis degerlerini bulabiliriz

        System.out.println("durationda :"+Duration.between(baslangic, bitis));//durationda :PT11.2517763S

        //3- toSecondOfDay() veya toNanoOfDay() ile arasındaki farki bulabiliriz

        System.out.println(baslangic.toSecondOfDay());//34013
        System.out.println(baslangic.toNanoOfDay());//34013385199400

        System.out.println(bitis.toNanoOfDay()-baslangic.toNanoOfDay());//8531616800
//with methodu
        System.out.println(saat.withHour(10));
        System.out.println(saat.withSecond(0).withNano(0));


//pluss methodu

        System.out.println(saat.plusHours(5).plusMinutes(12).plusSeconds(5));//ileri alır

// minus da geri alır

        System.out.println(saat.isBefore(baslangic));//true
        System.out.println(bitis.isAfter(baslangic));//true

    }
}
