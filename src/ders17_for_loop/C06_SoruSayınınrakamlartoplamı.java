package ders17_for_loop;

import java.util.Scanner;

public class C06_SoruSayınınrakamlartoplamı {

    public static void main(String[] args) {


        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();


        int basamakSayisi=(sayi+"").length();
        int birlerbasamagi=0;
        int rakamlarToplamı=0;

        for (int i =1; i<basamakSayisi; i++) {

            birlerbasamagi=sayi%10;



            rakamlarToplamı+=birlerbasamagi;

            sayi/=10;

        }

        System.out.println(rakamlarToplamı);


        //verilen baslangic ve bitis degerleri dahil olmak üzere
        // bu sayilar arasında 7 ile bölünebilen sayı adedini yazdırın

        int baslangıc=235;
        int bitis=1673;
        int sayac=0;
        for (int i = baslangıc; i <=bitis ; i++) {

            if (i%7==0){
            sayac++;

            }

        }
        System.out.print("7 ile bölünebilen sayılar adedi :"+sayac);






    }
}
