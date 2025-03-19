package ders23_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoopVsDoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici 0'a bastiginda islemi bitirin
        // kullanıcı bitirmek istediğinde toplam kaç adet pozitif tamsayı girdiğini
        //ve bunların toplamının kaç adet olduğunu yazdırın
        // kullanıcı negatif sayı girerse "negatif sayı kullanamazsınız "yazdırn
        //bu negatif sayıyı,sayı adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);

        int sayi=0;
        int sayiToplami=0;
        int count=0;

//while loop ile yapalım

        while (sayi!=0){

            System.out.println("lütfen pozitif tamsayı giriniz"+
                    "\n bitirmek için 0 a basınız");



            sayi=scanner.nextInt();

            if (sayi>0){

                sayiToplami+=sayi;
                count++;
            } else if (sayi<0) {

                System.out.println("negatif sayı giremezsiniz");

            }

            System.out.println("girilen "+count+"adet pozitif tamsayının toplamı : "+sayiToplami);
        }

do {

    System.out.println("lütfen pozitif tamsayı giriniz"+
            "\n bitirmek için 0 a basınız");



    sayi=scanner.nextInt();

    if (sayi>0){

        sayiToplami+=sayi;
        count++;
    } else if (sayi<0) {

        System.out.println("negatif sayı giremezsiniz");

    }





}while (sayi!=0);

        System.out.println("girilen "+count+"adet pozitif tamsayının toplamı : "+sayiToplami);







    }
}
