package TEKRAR.Konu.Konu05_WrapperClasses;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {

        System.out.println(25/10);//2

        System.out.println(15/4);//3;

        System.out.println(35%10);//5 35 in 5 e bolumunden kalan kactır...5 dır

        System.out.println(15%4);//3 15 in 4 e bolumden kalan 3 tur

        //girilen sayinin cift olup olmadıgını yazdırın
        //sayi 2'ye bolunuyorsa o sayi çiftdir %2==0 ise sayi çiftdir

        int sayi=45;
        System.out.println(sayi%2); //sayi cift değil;

//  kullanıcıdan bir tamsayı isteyin
//  girilen sayinin birler basamagını yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz : ");
        int girilenSayi=scanner.nextInt();

        int birlerBasamagi=girilenSayi%10;

        System.out.println("girilen sayinin birler basamagindeki sayi : "+birlerBasamagi);

        System.out.println(259/10);//25






    }
}
