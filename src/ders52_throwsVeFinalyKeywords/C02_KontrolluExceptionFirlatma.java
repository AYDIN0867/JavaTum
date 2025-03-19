package ders52_throwsVeFinalyKeywords;

import java.util.Scanner;

public class C02_KontrolluExceptionFirlatma {
    public static void main(String[] args) {

        //Kod'un herhangi bir satirinda kontrollu olarak exception firlatilabilir
        //Kontrollu bir sekilde baska bir bolume gecis veya
        //kullaniciya istenen mesaji iletme olabilir

        //kullanicidan yasini,cinsiyetini ve uyrugunu isteyin
        //yasi 60 ve 75 arasi olan  (sinirlar dahil)
        //cinsiyeti E veya K
        //uyrugu TC olanlar emekli olabilir

        //bilgileri alirken bir bilgi istenmeyen sekilde ise
        // hemen emekli olamazsinin yazdirsin ,diger bilgiler istemesin


        Scanner scanner=new Scanner(System.in);

        try {

            System.out.println("Lütfen yasinizi giriniz");
            int yas=scanner.nextInt();

            if (yas<=60||yas>=75){

                throw new IllegalArgumentException("Yas uygun degil");
            }
            scanner.nextLine();
            System.out.println("Lütfen cinsiyetinizi giriniz");
            String cinsiyet =scanner.nextLine();

            if (!(cinsiyet.equalsIgnoreCase("k")||cinsiyet.equalsIgnoreCase("e"))){

                throw new IllegalArgumentException("Cinsiyet uygun degil");
            }


            System.out.println("Lütfen uyruk giriniz");
            String uyruk =scanner.nextLine();

       if (!uyruk.equalsIgnoreCase("TC")){

           throw new IllegalArgumentException("Uyruk uygun degil");
       }

            System.out.println("emekli olabilirsin");

        }catch (Exception e){


            if (e.getMessage()==null){

                System.out.println("Yanlis giris");
            }else{



                System.out.println(e.getMessage());

            }
            System.out.println("emekli olamazsınız");

        }











    }
}
