package TEKRAR.Konu.Konu11_NestedIfStatements;

import java.util.Scanner;

public class C01_EmeklilikYasıHesaplamaNestedIf {
    public static void main(String[] args) {

        //Kullanıcıdan cinsiyetini ve yasını alın
        //Kadin,60 yas ve üzeri,Erkek 65 yas ve üzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak "Emekli Olabilirsin"
        //veya "Emekli olamak için ... Yıldaha çalışman gerek" yazdırn
        //kulanıcı E veya K disinda bir cinsiyet girerse
        //veya 15 yasdan kucuk ve 80 yasdan buyuk yas girerse uyarın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int yas = scanner.nextInt();

        System.out.println("lütfen cinsiyetiniz Erkek için E kadınlar için K diye belirtin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

/*

Eger bir if else de KARAR vermek icin baktıgımız VARİABLE sayisi birden fazla ise
NESTED ıf ELSE statement tercih edilebilir

Oncelikle bakacagımız 2 degiskenden birini
ana degisken kabul edip ona gore bir if else olustururuz

biz burada cinsiyeti ana değişken kabul edelim

 */

if (cinsiyet=='E'){//bu süzgecten sadece erkekeler gececeği için yaşı erkekelere göre degerlendireceğiz

    if (yas<15||yas>80){

        System.out.println("verdiğiniz yas için emeklilik hesaplanamaz...");

    } else if (yas>=65) {

        System.out.println("emekli olabilirsiniz");

    } else if (yas<65) {

        System.out.println("emekli olmanız için "+ (65-yas) + "yıl daha çalışmalısınız");

    }

} else if (cinsiyet=='K') {

    if (yas<15||yas>80){

        System.out.println("verdiğiniz yas için emeklilik hesaplanamaz...");

    } else if (yas>=60) {

        System.out.println("emekli olabilirsiniz");

    } else if (yas<60) {

        System.out.println("emekli olmanız için "+ (60-yas) + "yıl daha çalışmalısınız");
    }


}else System.out.println("cinsiyet için E yada K secmelisiniz...");


    }
}
