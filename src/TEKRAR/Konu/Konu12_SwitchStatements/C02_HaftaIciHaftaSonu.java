package TEKRAR.Konu.Konu12_SwitchStatements;

import java.util.Scanner;

public class C02_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //menü oluşturmada daha çok kullnaılır

        //Kulalnıcıdan gün ismini alın
        //girilen günün hafta içi ya da hafta sonu oldugunu yazdırn
        //kullanıcı gun ismini yanlıs yazarsa uyarın


        Scanner scanner=new Scanner(System.in);
        System.out.println("haftanın gün ismini yazınız...");
        String gunIsmi=scanner.nextLine().toLowerCase();

        switch (gunIsmi){

            case "pazartesi","salı","carsamba","çarşamba","persembe","cuma":
                System.out.println("haftaici");
                break;

            case "cumartesi","pazar":
                System.out.println("haftasonu");
                break;

            default:
                System.out.println("hatalı giris");
        }

        boolean emekliMi=true;
        long sayiLong=45;
        float safiFloat=46.8F;
        double sayiDouble=57;  //bu dört dataTürü için switch kullanılamaz...



    }
}
