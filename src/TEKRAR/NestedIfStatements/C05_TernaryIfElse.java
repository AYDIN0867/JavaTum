
package TEKRAR.NestedIfStatements;

import java.util.Scanner;

public class C05_TernaryIfElse {
    public static void main(String[] args) {


        //kullanıcıdan bir tam sayi isteyin
        // sayi 100 den buyukse sayiyi 10 azaltin
        // sayi 100 den buyuk değilse sayiya 20 ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        double girilenSayi = scanner.nextDouble();

        //if else ile yapalım

        if (girilenSayi>100){

            System.out.println(girilenSayi-10);

        }else System.out.println(girilenSayi+20);

        //ternary ile yapalım

        System.out.println(girilenSayi>100 ? girilenSayi-10: girilenSayi+20);

    }


}
