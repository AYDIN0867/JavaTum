package ders04_WrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        System.out.println(25/10);// 2.5 ==> 2 yi verir

        System.out.println(15/4);//3.75==> 3 ü yazdırır

        System.out.println(35%10);// 35 in 10 ile bölümünden kalan==>5 i yazdırır

        System.out.println(15%4);//15 in 4 ile bölümünde kalan ==>3 ü yazdırır

        // girilen sayının çift olup olmadığını yazdırın

        int sayi=6;
        System.out.println(sayi%2);// 0 sayi çifttir

        // girilen sayinin 5 e bölünüp bölünmediğini yazdırın

        System.out.println(sayi%5); //kalan sıfır ollamdığı için sayi yani 6, 5 e bölünmez

// kullanıcıdan bir tamsayı isteyin
        // girilen sayının birler basamağını yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Bir Tamsayı Giriniz");
         int tamsayi=scanner.nextInt();
        System.out.println("girdiğiniz tamsayının birler basamağı: "+tamsayi%10);//birler basamağını verir
        System.out.println(259/10);//25 verir





    }
}
