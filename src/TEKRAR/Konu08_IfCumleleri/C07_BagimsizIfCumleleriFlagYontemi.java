package TEKRAR.Konu08_IfCumleleri;

import java.util.Scanner;

public class C07_BagimsizIfCumleleriFlagYontemi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayi giriniz");
        int girilenSayi1= scanner.nextInt();
        int girilenSayi2= scanner.nextInt();
        int sayac=0;


        if(girilenSayi1<girilenSayi2){
            System.out.println("birinci sayi daha kucuk");

            sayac++;
        }

        //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"

        if(girilenSayi1>0){

            System.out.println("birinci sayi sıfırdan buyuk");

            sayac++;
        }

        if (girilenSayi2>50){

            System.out.println("ikinci sayı 50 den buyuk");

            sayac++;

        }

        if (girilenSayi2%5==0){

            System.out.println("ikinci sayı 5 ile bölünebilir");

            sayac++;
        }

        if(sayac==0){

            System.out.println("nasıl sayı sectiniz yamuk yumuk");
        }


        if(sayac==4){

            System.out.println("sayılar mükemmmel");
        }








    }
}
