package ders39_dataTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_FarkliZamanOlusturma {
    public static void main(String[] args) {

        LocalTime timeLondon=LocalTime.now(ZoneId.of("Europe/London")) ;//06:39:21.539950600
        System.out.println("London :"+timeLondon);



        LocalTime timeNetherLands=LocalTime.now(ZoneId.of("Europe/Amsterdam")) ;
        System.out.println("Amsterdam :"+timeNetherLands); //Amsterdam :07:39:21.553857300

        LocalTime timeTurkey=LocalTime.now();
        System.out.println("Turkey :"+timeTurkey); //Turkey :09:39:21.566770800


       // LocalTime.Of () ile istediğimiz degerelere sahip bir zaman variablei oluşturabiliriz...

       LocalTime isteneZaman=LocalTime.of(10,5,23);
        System.out.println(isteneZaman);//10:05:23

        LocalTime saniyedenSaat=LocalTime.ofSecondOfDay(44000);
        System.out.println(saniyedenSaat); //12:13:20


    }
}
