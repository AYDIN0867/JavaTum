package TEKRAR.Konu37_DataTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C03_Date {
    public static void main(String[] args) {

    //japonyadaki tarihi yazdırın

        LocalDate tarihJapan=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(tarihJapan); //2026-02-12


    }
}
