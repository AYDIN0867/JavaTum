package ders50_MultipleUnchekedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_SayiToplamaTryCatch {

    //kullanicidan toplamak üzere tamsayılar isteyin
    //ve kullanıcı q veya Q ya basincaya kadar islemi devam ettirin
    //kulllanici q ya abstığında
    //kaç adet sayı girdiğini ve toplamını yazdırın

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
int toplam=0;
int girilenSayi=0;
String girlenMetin="";
int sayac=0;

while (!girlenMetin.equalsIgnoreCase("q")){
    System.out.println("lütfen bir sayı giriniz");

    try {

        girilenSayi=scanner.nextInt();
        sayac++;
        toplam+=girilenSayi;

    }catch (InputMismatchException e){
        //kullanıcı q ya bastogında ve ya kural dışı baska bir şeye bastıgında

        girlenMetin= scanner.nextLine();

        if (!girlenMetin.equalsIgnoreCase("q")){

            System.out.println("girilen değer ya tamsayı olmalı ya da q olmalı");
        }
    }



}


        System.out.println("girilen "+sayac+" sayının toplamı "+toplam);


    }
}

