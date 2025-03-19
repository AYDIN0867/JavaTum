package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C08_Nested_IfElse_Emeklilik_Hesabı {

    public static void main(String[] args) {

        // kullanıcıdan cinsiyetini ve yasını alın
        // kadin,60 yas ve üzeri,erkek 65 yas ve üzeri emekli olabilir
        // cinsiyet ve yasını dikkate alarak "emekli olabilirsin
        //veya  "emekli olmak için ...yıl daha çalışman gerekir yazdırın
        //kullanıcı E ve K dışında bir cinsiyet girerse
        // veya 15 yaşı kucuk, 80 den büyük girerse uyarın

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz");
        double girilenYas=scanner.nextDouble();
        System.out.println("Lütfen cinsiyetinizi giriniz...E:Erkek, K:Kadın");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        // bir tanesi temel değişken oluşturulacak burada yaş yada cinsiyet


        /*
        eger bir if else KARAR VERMEK  için baktığımız variable sayisi
        BİRDEN FAZLA ise nested if else statement tercih edilebilir..

        BURADA cinsiyeti ana değişken kabul edelim




         */

       if (cinsiyet=='K'){// BU SÜZGEÇTENN SADECEC KADINLAR İÇİN, YAŞI KADINLARA GÖRE DEĞERLENDİREBİLİRİZ

           if (girilenYas<15||girilenYas>80){

               System.out.println("girilen yaş için emeklilik kontrol edilemez");
           } else if (girilenYas>=60) {

               System.out.println("kadın 60 yaşından büyük emekli olabilir.");

           }else{

               System.out.println("emekli olmak için "+(60-girilenYas)+"çalışmalısın");
           }


       } else if (cinsiyet=='E') {


           if (girilenYas<15||girilenYas>80){

               System.out.println("girilen yaş için emeklilik kontrol edilemez");
           } else if (girilenYas>=65) {

               System.out.println("erkek 65 yaşından büyük emekli olabilir.");

           }else{

               System.out.println("emekli olmak için "+(65-girilenYas)+"çalışmalısın");
           }



       }else System.out.println("cinsiyet olarak E veya K SEÇMELİSİNİZ");


    }
}
