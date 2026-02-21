package TEKRAR.Konu.Konu37_DataTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_Date {
    public static void main(String[] args) {

    //japonyadaki tarihi yazdırın

        LocalDate tarihJapan=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(tarihJapan); //2026-02-12

//hawai'deki tarihi yazdirin (Pacific/Honolulu)

LocalDate tarihHawai=LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println("Tarih Hawai : "+tarihHawai);//Tarih Hawai : 2026-02-13


        // 11 12 1993 için bir tarih oluşturualım....

LocalDate dogumTarihi=LocalDate.of(1993,11,13);
        System.out.println("Dogum Tarihi  "+ dogumTarihi);//Dogum Tarihi  1993-12-11

//11 12 1993 de doğan birinin su an kac yasında oldugunu yazıdırın...

        System.out.println(Period.between(dogumTarihi, tarihJapan));//P32 Y2 M2D

// Kullanıcıdan alınan iki dogum tarihini karşılaştırarak
// hangisinin daha önce dogdugunu yazdırın...

        LocalDate dogumTarihi2=LocalDate.of(1989,10,12);

        if(dogumTarihi2.isBefore(dogumTarihi)){

            System.out.println("2. kişi daha önce doğmuş...");

        } else if (dogumTarihi2.isAfter(dogumTarihi)) {
            System.out.println("2. kişi daha sonra doğmuş...");

        }else System.out.println("aynı gün doğdurlar");

        // 1900 yılının  artık yıl olup olmadıgını yzdırın

        LocalDate yil1900=LocalDate.of(1900,1,1);
        System.out.println(yil1900.isLeapYear()); //false

        System.out.println(tarihJapan.getDayOfYear()); //44
        System.out.println(tarihJapan.getMonth());//FEBRUARY

    }
}
