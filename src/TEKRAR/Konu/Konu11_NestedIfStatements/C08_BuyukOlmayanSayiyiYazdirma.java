package TEKRAR.Konu.Konu11_NestedIfStatements;

import java.util.Scanner;

public class C08_BuyukOlmayanSayiyiYazdirma {
    public static void main(String[] args) {

        //kullanıcıdan iki sayi alın ve buyuk olmayanı yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int girilenSayi1 = scanner.nextInt();
        int girilenSayi2 = scanner.nextInt();


        System.out.println(girilenSayi1>girilenSayi2  ? girilenSayi2:girilenSayi1);




    }
}
