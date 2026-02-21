package TEKRAR.Konu.Konu10_IfElseIf;

import java.util.Scanner;

public class C04_IndirimliFiyatHesaplama {
    public static void main(String[] args) {

//Kullanicıdan kac adet urun aldıgını ve bir urunun fiyatını sorun
// eger kullanıcı 100 adet veya daha fazla urun aldıysa %25,
// eger kullanıcı 50 adet veya daha fazla urun aldıysa %20,
// eger kullanıcı 10 adet veya daha fazla urun aldıysa %10 indirim yaparak
// odeyecegi toplam miktarı yazdırın
//Kullanıcı negatif bir fiyat veya adet girerse uyarı verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen aldıgınız urun adetini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("lütfen urun fiyatı giriniz....");
        double fiyat=scanner.nextDouble();



        if(urunAdedi<0|| fiyat<0){

            System.out.println("Urun adedi veya fiyat için pozitif rakam girilemlidir");
        }

      else if (urunAdedi>=100){
          double odenmesiGerekenUcret=(urunAdedi*fiyat)-((urunAdedi*fiyat)*25/100);
          System.out.println("%25 indirim kazandınız ve odemeniz gereken ücret " + odenmesiGerekenUcret );
      } else if (urunAdedi>=50) {
          double odenmesiGerekenUcret=(urunAdedi*fiyat)-((urunAdedi*fiyat)*20/100);
          System.out.println("%25 indirim kazandınız ve odemeniz gereken ücret " + odenmesiGerekenUcret );
      }else if (urunAdedi>=10) {
          double odenmesiGerekenUcret=(urunAdedi*fiyat)-((urunAdedi*fiyat)*20/100);
          System.out.println("%25 indirim kazandınız ve odemeniz gereken ücret " + odenmesiGerekenUcret );
      }else System.out.println("meleef indirim hakkınız yok  ödemeniz gereken ücret " + urunAdedi*fiyat + "TL");


    }
}
