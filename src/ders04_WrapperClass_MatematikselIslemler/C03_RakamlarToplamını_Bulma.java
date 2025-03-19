package ders04_WrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamını_Bulma {

    public static void main(String[] args) {
        // kullanıcıdan 3 basamaklı pozitif bir tamsayı isteyin
        // sayinin rakamlar toplamını bulun
        //örnek input:245 ise output=11

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı Bir Tamsayı Giriniz");

        int girilenSayi=scanner.nextInt();
        int birlerbasamagi=girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int onlarBasamagi=girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int yuzlerBasamagi=girilenSayi%10;

        System.out.println("Girdiğiniz Sayının Rakamları Toplamı :"+ (birlerbasamagi+onlarBasamagi+yuzlerBasamagi));









    }
}
