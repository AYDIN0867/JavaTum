package ders17_For_loop;

import java.util.Scanner;

public class C07_SoruAsalmı {


    public static void main(String[] args) {


// Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){

                System.out.println( "sayı asal değildir");
                System.out.println("i  :"+i);
                break;

            }

            if (i==sayi-1){

                System.out.println("asal");
            }

        }


    }
}
