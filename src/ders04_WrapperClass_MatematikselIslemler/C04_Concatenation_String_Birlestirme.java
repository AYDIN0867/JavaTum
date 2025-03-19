package ders04_WrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C04_Concatenation_String_Birlestirme {

    public static void main(String[] args) {



        // String'de + işlemi CONCATENATION (birleştirme) demektir
        // + dişinda hiçbir matematiksel işlem string ile kullanılmaz


        // sadece verieln variableleri  kullanarak
        // istenen Stringleri yazıdırn..


        String s1="Java";
        String s2=" ";
        String s3="Candir";
        String s4="";

        int a=3;
        int b=4;
        // 12 Java Candir
        System.out.println((a*b)+s2+s1+s2+s3);
        // 7 Java
        System.out.println((3+4)+s2+s1);
        // 34 Candir
        System.out.println(s4+a+b+s2+s3);
        // Java12Candir
        System.out.println(s1+(a*b)+s3);
        // java34candir

//        System.out.println(s1.toLowerCase()+a+b+s3.toLowerCase());

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("lütfen bir tamsayı giriniz");
//        int tamsayi=scanner.nextInt();
//        System.out.println("girilen sayı :"+tamsayi);


    }
}
