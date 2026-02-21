package TEKRAR.Konu.Konu12_SwitchStatements;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {

      //if else statements ile çözdüğümüz sorularda olasi durumların sayisi artıkça
      // if else if yapısı kurgulamasi ve anlasılması zor hale gelebilir...

     // kullanıcıdan haftanın kacıncı gununu yazdırmak istediğini sorun
     // 1-7 arasındaki degerler için pazartesiden pazar a kadar gun isimlerini yazdirin
     // 1-7 arasındaki sayilardan farklı bir sayı girerse hata mesajı yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("haftanın kacıncı gününü yazdırmak istiyorsunuz...");
        int istenenGun=scanner.nextInt();

        switch (istenenGun){

            case 1: //isteneGUn==1 oldugu durum
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("girilen gün numarası hatalı");

//kademeli çalıştırmadığımızda yani kodlama da istene kendi satırında birsin isityorsak
                //break yazarız
        }


        // 76.slayttaki soruları çöz....






    }
}
