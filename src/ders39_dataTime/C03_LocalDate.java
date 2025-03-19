package ders39_dataTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_LocalDate {

    public static void main(String[] args) {


        // japonyadaki tarihi yazdırın


        LocalDate tarihJapan=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(tarihJapan);//2025-02-22

        // Hawaideki tarihi yazdırın (Pacific/Honolulu)

LocalDate tarihHavai=LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(tarihHavai);//2025-02-21

        // 10 eylül 1989 için bir tarih olusturun

        LocalDate dogumTarihi=LocalDate.of(1989,9,10);
        System.out.println(dogumTarihi);//1989-09-10


        //10 eylül 1989 da doğan birinin su an kaç yasinda olduğunu yazdirin

        System.out.println(Period.between(dogumTarihi, tarihJapan)); //P35Y5M12D


        //kullanıcıdan alınan iki doğum tarihini karşılaştırarak
        //hangisinin daha önce doğduğunu yazdırın

        LocalDate dogumTarihi2=LocalDate.of(1989,10,12);

        if(dogumTarihi2.isBefore(dogumTarihi)){

            System.out.println("ikinci kişi daha önce doğmuştur");
        }else if(dogumTarihi2.isAfter(dogumTarihi)){

            System.out.println("ikinci kişi daha sonra doğmus");

        }else System.out.println("ikinci kişi aynı gun doğmuş");

//ikinci kişi daha sonra doğmus


        // 1900 yılının artık yıl olmasını kontrol edin

        LocalDate yil1900=LocalDate.of(1900,1,1);
        System.out.println(yil1900.isLeapYear());//false

        LocalDate yil1904=LocalDate.of(1904,1,1);
        System.out.println(yil1904.isLeapYear());//true

        System.out.println(tarihJapan.getDayOfYear());//53 yılın gününü veriyor
        // bugun tarih 02.22.2025 yılın 53. günü imiş

    }
}
