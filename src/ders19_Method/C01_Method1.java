package ders19_Method;

import java.util.Scanner;

public class C01_Method1 {

    public static void main(String[] args) {




        /*
        kullanıcıdan alınan bir metinden
        kullanıcının gidiriği baslangic ve bitis indexleri arasındaki kısmı yazdırın


        Kurallar:
        1-eger baslangıc veya bitis index'i negatif veya metnin sinirlari dısında ise hata verin
        2-baslangic index'i bitis indexinden büyükse hata mesajı verin
        3-baslangıc indexindeki karakter dahil,bitis indexindeki karakter haric olmalıdır


         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz....");
        String girilenMetin=scanner.nextLine();
        System.out.println("lütfen başlangıc indeksini giriniz");
        int basIndex= scanner.nextInt();
        System.out.println("lütfen bitiş indeksini giriniz");
        int bitisIndex= scanner.nextInt();

     if (basIndex<0||bitisIndex<0||basIndex>=girilenMetin.length()||bitisIndex>=girilenMetin.length()){

         System.out.println("girilen değerler hatalıdır");
     }else if (basIndex>bitisIndex){

         System.out.println("baslagıc indeksi bitiş indeksinden yüksek olmammalı");
     }else {

         for (int i = basIndex; i <bitisIndex ; i++) {

             System.out.print(girilenMetin.charAt(i));

         }


     }


        System.out.println(girilenMetin.substring(basIndex,bitisIndex));






    }
}
