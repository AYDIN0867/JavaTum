package TEKRAR.Konu.Konu16_Empty_Length;

import java.util.Scanner;

public class C06_BilgileriDüzenleme {
    public static void main(String[] args) {

// Kullanıcıdan ismini, soyismini, ve 16 haneli kredi karti numarasını alin
// bilgileri asagıdaki gibi yazdirin
// girilen isim-soyisim  : C** D***,
// Kredi kart numarasi : **** **** **** 4567

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz....");
        String isim=scanner.nextLine();
        System.out.println("lütfen soyisminizi giriniz....");
        String soyIsim=scanner.nextLine();
        System.out.println("lütfen kredi kart numarazanızı giriniz");
        String kredikartıNo=scanner.nextLine();

       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
       kredikartıNo=kredikartıNo.substring(0,4).replaceAll("\\d","*")
               +" "
               +kredikartıNo.substring(5,9).replaceAll("\\d","*")
               +" "
               +kredikartıNo.substring(10,14).replaceAll("\\d","*")
               +" "
               +kredikartıNo.substring(15);


        System.out.println(

             "girilen isim-soyisim :" + isim + " "+soyIsim + "\n Kredi kartı numarası :" + kredikartıNo


        );











    }
}
