package TEKRAR.Konu.Konu22_WhileLooP;

import java.util.Scanner;

public class C04_EnUzunKelime {
    public static void main(String[] args) {

        // asagida gorevi yapan bir metod olusturun
        // kullanıcıdan islemi bitirmek için Q ya basmalıdır..(q veya Q olabilir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin...
        // esit sayida harfe sahip isimlerden herhangi biri olabilir...


enUzunIsimYazdir();

    }


    public static void enUzunIsimYazdir(){

        Scanner scanner=new Scanner(System.in);
        String girilenIsim="";
        String enUzunIsim="";

        while (!(girilenIsim.equalsIgnoreCase("q"))) {

            System.out.println("lütfen isim giriniz işlemi bitirmek için" +
                    "\nq ya basınız");

            girilenIsim = scanner.nextLine();


            if (girilenIsim.length() > enUzunIsim.length()) {

                enUzunIsim = girilenIsim;

            }


        }


        System.out.println("en uzun isim"+ enUzunIsim);














    }


}
