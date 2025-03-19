package ders10_Ternary;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        // kullanıcıdan  bir tamsayı alın
        // sayi 100 den büyük ise sayıyı 10 azaltın
        //sayı 100 den büyük değilse sayıya 20 ekleyin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        // if else ile çözelim

//        if (sayi>100){
//
//           sayi-=10;
//        }
//
//        else {
//
//            sayi+=20;
//        }


        // ternary iel yapalım


       sayi=sayi>100? sayi-10: sayi+20;

        System.out.println(sayi);

    }
}
