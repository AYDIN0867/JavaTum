package ders22_WhileLoop;

import java.util.Scanner;

public class C03_EnUzunKelime {
    public static void main(String[] args) {

       // asagıdaki görevi yapan bir method oluştrun
       // kullanıcıdan istediği kadar isim girmesini isteyin
       //kullanıcı işlemi bitirmek için Q ya basmalıdır(q veya Q olabilir)
       //girilen her isimin uzunluğunu kontrol edin ve
       // islem bitirildiğinde en cok harfe sahip olan (en uzun) ismi yazdırın
       //esit sayıda harfe sahip isimlerden herhangi biri olabilir

       enUzunIsmiyazdir();

    }

    public static void enUzunIsmiyazdir(){


        Scanner scanner=new Scanner(System.in);

        int count=0;
        String girilenIsım="";
        String enUzunIsım="";
        while (!girilenIsım.equalsIgnoreCase("q")){

            System.out.println("lütfen en uzun ismi bulmak için isim giriniz"+"\n bitirmek için q ya basınız");


            girilenIsım=scanner.nextLine();

            if (girilenIsım.length()>enUzunIsım.length()){

                enUzunIsım=girilenIsım;

            }




        }





        System.out.println("girilen isimlerden en uzun olanı..: "+ enUzunIsım);





    }




}
