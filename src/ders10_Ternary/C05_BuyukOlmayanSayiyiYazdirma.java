package ders10_Ternary;

import java.util.Scanner;

public class C05_BuyukOlmayanSayiyiYazdirma {

    public static void main(String[] args) {
// kullanıcıdan iki tamsayıyı alın büyük OLAMAYANI yazdırın



        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  iki tamsayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        System.out.println(sayi1<sayi2?sayi1:sayi2);



    }
}
