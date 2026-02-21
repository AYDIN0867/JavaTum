package TEKRAR.Konu.Konu03_KullanıcıdanDataAlma;

import java.util.Scanner;

public class D04_KullanicidanBilgiAlipYAzdirma {
    public static void main(String[] args) {

        //Soru-5 Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin
        //girilen bilgiler:J Doe, 44

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen soyisminizi ve yasinizi giriniz");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen  yasinizi giriniz");
        double yas=scanner.nextDouble();

        System.out.println(

                "girilen Bilgiler : "+ isim.charAt(0)+" "+soyIsim+", "+yas
        );














    }//main method sonu
}
