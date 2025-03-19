package ders49_Exception_TryCatcher;

import java.util.Scanner;

public class C01_IfElseIleHataOnleme {
    public static void main(String[] args) {

        //kullanıcıdan iki tamsayı isteyip
        //sayıları birbirine bölün ve sonucu yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen birinci tamsayıyı giriniz");
        int sayi1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("lütfen ikinci tamsayıyı giriniz");
        int sayi2=scanner.nextInt();

       if (sayi2!=0){
           int sonuc=sayi1/sayi2;
           System.out.println("sayı1/sayı2  :"+ sonuc);
       } else {

           System.out.println("2. sayi 0 olamaz");
       }



    }
}
