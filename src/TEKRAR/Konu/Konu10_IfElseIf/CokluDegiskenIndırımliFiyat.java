package TEKRAR.Konu.Konu10_IfElseIf;

import java.util.Scanner;

public class CokluDegiskenIndırımliFiyat {
    public static void main(String[] args) {

        //Kullanicidan aldıgı urun adedini ve indirimsiz fiyatını alin
        // kullaniciya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20
        //                                az alırsA %15 İNDİRİM YAPIN
        //Musteri kartı yoksa 10 urunden fazla alırsa %15
                                 // az alırsa %10 indirim yapın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen aldıgınız urun adetini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("lütfen urun fiyatı giriniz....");
        double fiyat=scanner.nextDouble();
        System.out.println("MUSTERI KARTINIZ VARSA V YOKSA Y yazınız");
        char kartDurumu=scanner.next().toUpperCase().charAt(0);

        if(kartDurumu=='V'&& urunAdedi>=10){

            System.out.println("%20 indirim ile ödeyeceğiniz tutar :"+ urunAdedi*fiyat*(80/100));

        } else if (kartDurumu=='V'&& urunAdedi<10) {

            System.out.println("%15 indirim ile ödeyeceğiniz tutar :"+ urunAdedi*fiyat*(85/100));

        } else if (kartDurumu=='Y'&& urunAdedi>=10) {

            System.out.println("%15 indirim ile ödeyeceğiniz tutar :"+ urunAdedi*fiyat*(85/100));
        }else if (kartDurumu=='Y'&& urunAdedi>=10) {

            System.out.println("%10 indirim ile ödeyeceğiniz tutar :"+ urunAdedi*fiyat*(90/100));
        }


    }
}
