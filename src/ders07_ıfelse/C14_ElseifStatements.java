package ders07_ıfelse;

import java.util.Scanner;

public class C14_ElseifStatements {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen  pozitif tamsayı giriniz");

        int sayi1=scanner.nextInt(); // break ve continue ile devam edin


        if (sayi1<0){

            System.out.println("negatif tamsayı girdiniz");

        } else if (sayi1<10) {

            System.out.println("girdiginiz sayi rakam");

        } else if (sayi1>=10&&sayi1<99) { //Condition 'sayi1>=10' is always 'true'

            System.out.println("iki basamaklı sayı");

        } else if (sayi1<=999) {

            System.out.println("sayı üç basamaklı sayı");

        }else{

            System.out.println("çok büyük sayı");
        }

    }
}
