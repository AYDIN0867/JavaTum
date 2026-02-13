package TEKRAR.Konu37_DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDateTime_DataTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt); //2026-02-13T15:55:48.507653



        /*

        Tarih ve zamanı istediginiz formatta yazdırabilirsiniz
        once istediginiz formati hazırlamalısınız.....
        Java da istenen formatı hazırlamalaısınız
        JAva da istenen formatı hazırlamak icin DateTimeFormatter class'ında
        format olusturulması gerekir....

         */


        //01.11.2024 Cuma

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");

/*

d: basta 0 varsa onu yazmadan gun numarası
dd: tek haneli gunlei 01 gibi basina sıfır yazarak gun numarası
DDD: yılın kacıncı gunu oldugunu yazar
E,EE,EEE : gün isminin tamamını yazar...





 */

        System.out.println(ldt.format(format1));//13.02.2026 Cuma


        // 1/November/2024 297.gun

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("d/MMMM/yyyy DDD");
        System.out.println(ldt.format(format2)+ ".gun"); //13/Şubat/2026 044.gun

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("d MMM yy");
        System.out.println(ldt.format(format3)); //13 Şub 26

        //10:19 24 saatlik dilime gore

        DateTimeFormatter format4=DateTimeFormatter.ofPattern("HH: mm");
        System.out.println(ldt.format(format4)); //16: 08




    }

}
