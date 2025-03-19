package ders39_dataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDate_Time {

    public static void main(String[] args) {

        LocalDateTime ltd=LocalDateTime.now();
        System.out.println(ltd);//2025-02-22T10:06:41.397962800

//01.11.2024 Cuma
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");

        System.out.println(ltd.format(format1)); //22.02.2025 Cumartesi

        //22/Şubat/2025 53.gün

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MMMM/yyyy DDD");
        System.out.println(ltd.format(format2)+" .gun");//22/Şubat/2025 053 .gun


        //10:19 24 saatlik dilime göre yazdırın

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ltd.format(format3)); //10:23

//12 saatlik dilime göre

        DateTimeFormatter format4=DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(ltd.format(format4)); // 10:24 ÖÖ

        // saat, dakika,saniye hepsi 2 basamaklı ve 24 saate göre olsun

        DateTimeFormatter format5=DateTimeFormatter.ofPattern("HH:mm: ss");
        System.out.println(ltd.format(format5)); //10:26 44

        DateTimeFormatter format6=DateTimeFormatter.ofPattern("H:m s");
        System.out.println(ltd.format(format6)); //10:28 12

        //Wed Oct 23 3:20 PM
        DateTimeFormatter format7=DateTimeFormatter.ofPattern("EEE MMM dd hh:mm a");
        System.out.println(ltd.format(format7)); //Cmt Şub 22 10:30 ÖÖ


    }
}
