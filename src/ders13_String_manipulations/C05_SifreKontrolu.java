package ders13_String_manipulations;

import java.util.Scanner;

public class C05_SifreKontrolu {

    public static void main(String[] args) {

        // şifre oluşturmka için sifre isteyin
        // iki defa girmesini isteyin
        // metin tamamen aynı ise şifreniz başaroılı olarak kaydedildi
        // eger metin aynı olduğu halde  casse yazım farklılığı varsa
        // "lütfen yazimi kontrol edin yazdırın
        //eger karakter faklılığı varsa
        // girilen şifreler farklı yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen şifreyi giriniz...");
        String sifre1=scanner.nextLine();
        System.out.println("lütfen ikinci şifreyi giriniz");
        String sifre2=scanner.nextLine();

        if (sifre1.equals(sifre2)){

            System.out.println("şifreniz başaroılı olarak kaydedildi");
        } else if (sifre1.equalsIgnoreCase(sifre2)) {

            System.out.println("lütfen yazimi kontrol edin");
            
        } else if (!sifre1.equals(sifre2)) {

            System.out.println("girilen şifreler farklı");

        }


    }
}
