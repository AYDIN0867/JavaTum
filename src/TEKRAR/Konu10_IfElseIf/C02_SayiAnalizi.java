package TEKRAR.Konu10_IfElseIf;

import java.util.Scanner;

public class C02_SayiAnalizi {
    public static void main(String[] args) {

        //kulalnicidan pozitif bir tamsayi isteyin
        //kullanici
        //negatif sayi girer SE uyarin deyin ki ; pozitif sayi girdedik ülen
        //tek basmakli bir sayi girerse "girdiğiniz sayi rakam "
        //kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi"

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        double girilenSayi = scanner.nextDouble();

        if (girilenSayi <= 0) {

            System.out.println(" pozitif sayi girdedik ülen");

        } else if (girilenSayi <= 9) {

            System.out.println("girdiğiniz sayi rakam ");

        } else if (girilenSayi <= 99) {

            System.out.println("girdiğiniz iki basamaklı sayi ");

        } else if (girilenSayi <= 999) {

            System.out.println("girdiğiniz üç basamaklı sayi ");


        }else if (girilenSayi >= 1000) {

            System.out.println("girdiğiniz sayi BÖYÜK SAYI");


        }
    }
}