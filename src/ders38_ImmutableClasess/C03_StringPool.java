package ders38_ImmutableClasess;

public class C03_StringPool {
    public static void main(String[] args) {

     String str1="Ali";//havuzda
     String str2="Ali";//havuzda
     String str3=new String("Ali");//havuzda değil
     String str4="A"+"li";//havuzda
     String s="A";//havuzda
     String t="li";//havuzda
     String str5 =s+t;//havuzda değil
     String r="ali";//havuzda
     String str6=r.substring(0,1).toUpperCase()+r.substring(1);//havuzda değil

        /*
java da temel olarak 2 turlu String olusturabiliriz
1- en basit yöntem olan " "icinde yazarak veya " " lari + ile birleştirerek
2- new keyword veya methodlar kullanilarak

java obje olusturmada tasarruf etmek için
1. yontemle olusturulan Stringleri ayri bir string poolda tutar

EGERRRR 1. yontemle string olusturdugumuzda String poolda daha önce ayni
degere sahip bir String varsa
java yeni String ile eslestirir
ayni referans ve ayni degeri kullnamalari saglar


         */

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        System.out.println(str1.equals(str6));//true
        System.out.println(str1.equals("Ali"));//true

        System.out.println("==================================");


        /*
         String ifadelerin esitliğini kontrol etmek için == kullanirsak metni ayni olan
         ifadeler için her zaman true vermez

         == sadece metne bakmaz, metne ve referansa birlikte bakar
         yani true olması için hem metnin hem de referansin ayni olmasi gerekir
         bu da ancak String Pool da olup metni ayni olan Stringler MUMKUNDUR

         */

/*

havuzda olanlar: str1,str2,str4,s,t,r,Ali
havuzda OLMAYANLAR: str3,str5,str6


 */


        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1=="Ali");//true
        System.out.println(str2=="Ali");//true
        System.out.println(str3==str4);//false
        System.out.println(str5==str6);//false
        System.out.println(str6==str2);//false


    }
}
