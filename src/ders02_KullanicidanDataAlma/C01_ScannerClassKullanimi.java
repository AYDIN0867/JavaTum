package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {
    public static void main(String[] args) {

       // kullanıcıdan bir double ve bir de integer sayı alıp
       // bunların toplamını ve çarğımını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi2=scan.nextInt();
        System.out.println("lütfen bir bir virgüllü sayı giriniz");
        double sayi1=scan.nextDouble();


        double carpim=sayi1*sayi2;
        double toplam=sayi1+sayi2;

        System.out.println("Sayıların Çarpımı :" +carpim+ " Sayıların Toplamı "+toplam);




    }

}
