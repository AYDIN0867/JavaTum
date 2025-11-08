package TEKRAR.NestedIfStatements;

import java.util.Scanner;

public class C02_Indrim1 {
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


        if (kartDurumu=='V'){

          if (urunAdedi>=10){

              System.out.println("odemeniz gereken ücret %20 indirim hesaplanarak" + (urunAdedi*fiyat)*80/100 );

          } else if (urunAdedi<10) {

              System.out.println("odemeniz gereken ücret %15 indirim hesaplanarak" + (urunAdedi*fiyat)*85/100 );
          }


        } else if (kartDurumu=='Y') {

            if (urunAdedi>=10){

                System.out.println("odemeniz gereken ücret %15 indirim hesaplanarak" + (urunAdedi*fiyat)*85/100 );

            } else if (urunAdedi<10) {

                System.out.println("odemeniz gereken ücret %15 indirim hesaplanarak" + (urunAdedi*fiyat)*90/100 );
            }


        }else System.out.println("KART DURUMU ICIN V yada Y yazmalısınız");


    }
}
