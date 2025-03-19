package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C01_Ifelse_If {
    public static void main(String[] args) {


        //kullanıcıdan pozitif bir tamsayı isteyin
        // kullanıcı
        //negatif sayı girerse uyarın
        //tek basamaklı bir sayı girerse "girdiğiniz sayı rakam"
        // kullanıcı 10-99 arasında sayi girerse "iki basamaklı sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz :");
        double girilenSayi=scanner.nextDouble();

        if (girilenSayi>=1&&girilenSayi<10){

            System.out.println("Girilen sayı rakam");
        } else if (girilenSayi>=10&&girilenSayi<=99) {

            System.out.println("girilen sayi iki basamaklı sayı");

        } else if (girilenSayi>=100&&girilenSayi<=999) {

            System.out.println("uc basamakli sayi");

        }else {

            System.out.println("hatalı giriş yaptınız lütfen pozitif sayı giriniz");
        }


    }

}
