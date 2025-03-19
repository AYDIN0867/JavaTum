package ders16_For_Loop;

import java.util.Scanner;

public class C03_AradakiSayılarinToplami {

    public static void main(String[] args) {

     //kullanıcıdan baslangıc ve bitis degeri olarak pozitif sayıları alın
     //sınırlar dahil olarak aralarındaki tum sayıların toplamını yazdırın
     //bitiş degeri baslangıc degerinden kucukse,uyarı
        // yazdırırp islemi sonlandırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir baslangıc dgeri giriniz");
        int baslangic=scanner.nextInt();
        System.out.println("lütfen pozitif bir bitis degeri giriniz");
        int bitis=scanner.nextInt();
        int toplam=0;

        if (baslangic>bitis){

            System.out.println("baslangıc degeri bitis degerinden kucuk olamaz");
        }

        else {

            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i;

            }

        }
        System.out.println(baslangic+" ile "+bitis+" sayıları arasındaki sayaıların toplamı : "+toplam);























    }
}
