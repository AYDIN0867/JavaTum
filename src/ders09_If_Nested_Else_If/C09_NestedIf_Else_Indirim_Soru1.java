package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C09_NestedIf_Else_Indirim_Soru1 {

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
        char kartDurumu=scanner.next().charAt(0);


        // ana değişken kart var mı

        if (kartDurumu=='V'){ //kartı olanlar bölümü

            if (urunAdedi<0){

                System.out.println("ürün adedi negatif olamaz");
            } else if (urunAdedi>=10) {

                System.out.println("ödeyeceğiniz %20 indirimli fiyat :"+ (urunAdedi*fiyatUrun*0.80));

            } else {

                System.out.println("ödeyeceğiniz %15 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.85));
            }




        } else if (kartDurumu=='Y') { // kartı olmayanlar bölümü

            if (urunAdedi<0){

                System.out.println("ürün adedi negatif olamaz");
            } else if (urunAdedi>=10) {

                System.out.println("ödeyeceğiniz %15 indirimli fiyat :"+ (urunAdedi*fiyatUrun*0.85));

            } else {

                System.out.println("ödeyeceğiniz %10 indirimli fiyat :"+(urunAdedi*fiyatUrun*0.90));
            }



        }else {

            System.out.println("kart var mı için V veya Y işaretlemelisiniz....");
        }


    }
}
