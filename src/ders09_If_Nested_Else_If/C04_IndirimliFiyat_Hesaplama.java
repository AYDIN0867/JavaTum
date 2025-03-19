package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C04_IndirimliFiyat_Hesaplama {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve bir ürünün fiyatini sorun,
        //eger kullanıcı 100 adet veya daha fazla aldıysa %25
       // eger 50 adet veya daha fazla aldıysa %20
       // eger 10adet veya daha fazla aldıysa %10 indirim yaparak
       //ödeyeceği toplam miktarı yazdırın
       //kullanıcı negatif bir fiyat girerse uyarı verin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini ve ürün fiyatını giriniz");
        System.out.print("ürün adedi  :");
        double urunAdedi=scanner.nextDouble();
        System.out.print("ürün fiyatı  :");
        double fiyatUrun=scanner.nextDouble();

        if (urunAdedi<=0||fiyatUrun<=0){

            System.out.println("ürün adedi ve fiyatı pozitif olmalı");
        }

        if (urunAdedi>=100){

            System.out.println("ödeyeceğiniz tutar %25 indirimli olarak:"+(urunAdedi*fiyatUrun*0.75));
        } else if (urunAdedi>=50) {

            System.out.println("ödeyeceğiniz tutar %25 indirimli olarak:"+(urunAdedi*fiyatUrun*0.80));

        } else if (urunAdedi>=10) {

            System.out.println("ödeyeceğiniz tutar %25 indirimli olarak:"+(urunAdedi*fiyatUrun*0.90));

        } else {

            System.out.println("ödeyeceğiniz tutar %25 indirimli olarak:"+(urunAdedi*fiyatUrun));


        }




    }
}
