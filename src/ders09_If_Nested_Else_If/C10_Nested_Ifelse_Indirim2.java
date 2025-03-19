package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C10_Nested_Ifelse_Indirim2 {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini ve ürün fiyatını giriniz");
        System.out.print("ürün adedi  :");
        double urunAdedi=scanner.nextDouble();
        System.out.print("ürün fiyatı  :");
        double fiyatUrun=scanner.nextDouble();
        System.out.println("müşteri kartınız varmı varsa V:VAR, yoksa Y:YOK");
        char kartDurumu=scanner.next().toUpperCase().charAt(0);


        // ana değişken ürün adedi

       if (urunAdedi<0){



           System.out.println("ürün adedi 0 dan az olamaz ");




       } else if (urunAdedi<10) {

           if (kartDurumu=='V'){

               System.out.println("ödeyeceğiniz %15 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.85));

           } else if (kartDurumu=='H') {

               System.out.println("ödeyeceğiniz %10 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.90));

           }else {

               System.out.println("kart bilgisini yanlış giridiniz");
           }


       }else { // ürün adedi 10 dan büyük olanlar


           if (kartDurumu=='V'){

               System.out.println("ödeyeceğiniz %20 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.80));

           } else if (kartDurumu=='H') {

               System.out.println("ödeyeceğiniz %10 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.85));

           }else {

               System.out.println("kart bilgisini yanlış giridiniz.. kart bilgisi için V VEYA Y giriniz");
           }




       }


    }
}
