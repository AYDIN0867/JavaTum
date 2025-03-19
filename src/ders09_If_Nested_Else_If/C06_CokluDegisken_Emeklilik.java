package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C06_CokluDegisken_Emeklilik {

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
//ÖNCE ÖNCE HATAYI SÖYLEYERK BAŞLA...ÖNEMLİ asagıdaki satırda kodlamaya önce hatayı söyleyerek başlıyoruz...
        if (girilenYas<15||girilenYas>80||!(cinsiyet=='E'||cinsiyet=='K'))

            System.out.println("girilen değerleri gözden geçiriniz");

        if (cinsiyet=='K'&&girilenYas>=60){

            System.out.println("KADIN emekli olabilirsin");

        } else if (cinsiyet=='K'&& girilenYas<60) {

            System.out.println("emekli olmak için "+(60-girilenYas)+"çalışmalısın");

        } else if (cinsiyet=='E'&&girilenYas>=65) {

            System.out.println("erkek emekli olabilir");

        } else if (cinsiyet=='E'&&girilenYas<65) {

            System.out.println("emekli olmak için "+(65-girilenYas)+"çalışmalısın");

        }


    }
}
