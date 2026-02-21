package TEKRAR.Konu.Konu36_ImmuTableClass;

import java.time.LocalDateTime;

public class C03_StringPool {
    public static void main(String[] args) {
        String str1="Ali";//havuzda
        String str2="Ali";//havuzda
        String str3=new String("Ali");//havuzda değil
        String str4="A"+"li";//havuzda
        String s="A";//havuzda
        String t="li";//havuzda
        String str5=s+t;//havuzda değil
        String r="ali";//havuzda
        String str6=r.substring(0,1).toUpperCase()+r.substring(1);//değil

        /*

        java da temel olarak 2 adet string oluşturulur...
        1- en basit yöntem olan "içinde yazarak veya" "" ları + ile birleştirerek
        2- new keyword veya metodlar kullanılarak...

        java obje oluşturmada tasarruf etmek icin
        1- yontemle oluşturulan String'leri ayri bir String Pool da tutar




         */

        System.out.println(str1.equals(str2));//Ali==Ali true
        System.out.println(str1.equals(str3));//equals sadece metne bakar
        System.out.println(str1.equals(str4));//Ali==Ali true
        System.out.println(str1.equals(str5));//Ali==Ali true
        System.out.println(str1.equals(str6));//Ali==Ali true
        System.out.println(str1.equals("Ali"));//Ali==Ali true

        System.out.println("=====================================");

        /*

        eşit eşit hem metne hem referansa bakar
         */

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1=="Ali");//true
        System.out.println(str2=="Ali");//true
        System.out.println(str3==str4);//false


        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);//2026-02-07T23:44:47.849425600

    }



}
