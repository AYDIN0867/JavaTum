package TEKRAR.Konu37_DataTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_FarklıZamanOlusturma {
    public static void main(String[] args) {

        //localTime.now(ZoneId) ile istedigimiz ulke/sehirdeki zamanı kullanabilriz...

        LocalTime timeLondon=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London :"+timeLondon); //London :21:36:53.390997

        LocalTime ankara=LocalTime.now();
        System.out.println("Ankara"+ ankara); //Ankara00:36:53.399993700

        LocalTime istenenZaman=LocalTime.of(10,5,23);
        System.out.println(istenenZaman);//10:05:23


/*
Europe/London
America/New_York
America/Chicago
America/Denver
America/Los_Angeles
Europe/Paris





 */



    }
}
