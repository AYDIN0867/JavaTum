package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        // soru 7 (interview) kullanıcidan iki sayi alip
        // ikisinin değerini değiştirme


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Birinci sayıyı giriniz");
        double sayi1= scanner.nextDouble();//25
        System.out.println("lütfen ikinci sayiyi giriniz");
        double sayi2=scanner.nextDouble();//40

        //

        double sayi3=0;// sayi1=25,sayi2=40,sayi3=0

        sayi3=sayi2;// sayi1=25,sayi2=40,sayi3=40

        sayi2=sayi1;//sayi1=25,sayi2=25,sayi3=40

        sayi1=sayi3;// sayi1=40,sayi2=25,sayi3=40


        System.out.println("Sai1 in değeri: "+sayi1);//40
        System.out.println("sayi2 nin değeri: "+ sayi2);//25





    }
}
