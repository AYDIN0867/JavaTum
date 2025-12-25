package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C11_AsalMıEgitim {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz...");
        int girilenSayi=scanner.nextInt();
        int sayac=0;

        for (int i =1; i<= girilenSayi ; i++) {


            if (girilenSayi%i==0){

                sayac++;
            }

        }

        if (sayac==2){

            System.out.println("girilen sayı asaldır");
        }else System.out.println("sayı asala değildir...");



    }
}
