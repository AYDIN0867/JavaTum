package TEKRAR.Konu.Konu22_WhileLooP;

import java.util.Scanner;

public class C03_WhileLoopAvantajlıOrnek {
    public static void main(String[] args) {

        // kullanciya istedigi kadar pozitif sayi girmesini soyleyın
        // girilen sayilar pozitif ise sayıyı toplama ekleyin
        // girilen sayi negatif ise uyarı verin ve sayiyi isleme almayın
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarının kac oldugunu yazdırın...

        Scanner scanner=new Scanner(System.in);
        int sayi=10;

        int toplam=0;
        int sayac=0;

        while (sayi!=0){

            System.out.println("lütfen pozitif bir sayı giriniz" +
                    "\nbitirmek için 0 a basınız...");

            sayi=scanner.nextInt();

            if (sayi>0){

                toplam+=sayi;
                sayac++;

            }else if (sayi<0){

                System.out.println("lütfen pozitif sayı giriniz..");

            }



        }


        System.out.println("girilen " + sayac+" adet pozitif sayısının toplamı "+ toplam);





    }
}
