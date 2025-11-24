package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C08_AsalMıBaskaYontem {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı isteyip,
        // sayinin asal sayı olup olmadıgını kontrol edin, ve sonucu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi = scanner.nextInt();

        for (int i = 2; i <sayi ; i++) {


            if (sayi%i==0){

                System.out.println("girilen sayi asal değil");
                break;
            }

            if (i==sayi-1){

                System.out.println("sayı asaldır");
            }

        }





    }

}
