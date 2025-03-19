package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C07_CokluDegisken_IndirimHesaplama {


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


        if (kartDurumu=='V'&& urunAdedi>10){

            System.out.println("ödemeniz gereken %20 indirimli tutar :"+(urunAdedi*fiyatUrun*0.80));
        } else if (kartDurumu=='V'&& urunAdedi<=10) {

            System.out.println("ödemeniz gereken %15 indirimli tutar :"+(urunAdedi*fiyatUrun*0.85));

        } else if (kartDurumu=='Y'&& urunAdedi>10) {
            System.out.println("ödemeniz gereken %90 indirimli tutar :"+(urunAdedi*fiyatUrun*0.90));

        } else if (kartDurumu=='Y'&& urunAdedi<=10) {

            System.out.println("ödemeniz gereken indirimli tutar :"+(urunAdedi*fiyatUrun*0.85));

        }


    }
}
