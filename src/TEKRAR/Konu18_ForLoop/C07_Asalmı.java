package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C07_Asalmı {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı isteyip,
        // sayinin asal sayı olup olmadıgını kontrol edin, ve sonucu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();
        int sayac = 0;

        for (int i = 1; i <= girilenSayi; i++) {

           if (girilenSayi%i==0){

               sayac++;
           }

        }

        if (sayac==2){

            System.out.println("sayı asaldır");

        }else System.out.println("sayı asal değildir..");




    }
}