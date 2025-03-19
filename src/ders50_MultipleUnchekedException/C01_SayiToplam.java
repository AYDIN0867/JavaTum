package ders50_MultipleUnchekedException;

import java.util.Scanner;

public class C01_SayiToplam {

    public static void main(String[] args) {

        //kullanicidan toplamak üzere tamsayılar isteyin
        //ve kullanıcı q veya Q ya basincaya kadar islemi devam ettirin
        //kulllanici q ya abstığında
        //kaç adet sayı girdiğini ve toplamını yazdırın

        Scanner scanner=new Scanner(System.in);

        int sayac=0;
       String girilenMetin;
       int toplam=0;
       int girilensayi=0;
        System.out.println("lütfen toplanmak üzere sayı giriniz...\n bitirmek için q ya baasınız");

       while (true){

           girilenMetin=scanner.nextLine();

           if(girilenMetin.equalsIgnoreCase("q")){
               break;


           }

           boolean gecerlisayi=true;
           for (int i = 0; i < girilenMetin.length(); i++) {

               if (i==0&&girilenMetin.charAt(i)=='-'){

                   continue;
               }

               if(!Character.isDigit(girilenMetin.charAt(i))){
               gecerlisayi=false;
               break;

               }

               if (gecerlisayi){

                   int sayi=Integer.parseInt(girilenMetin);
                   sayac++;
                   toplam+=sayi;
               }else{

                   System.out.println("gecersiz sayı lütfen tamsayı giriniz");
               }

           }


           System.out.println("girilen sayı adedi "+ sayac);
           System.out.println("girilen sayıların toplamı : "+ toplam);

       }










    }
}
