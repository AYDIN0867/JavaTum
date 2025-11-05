package TEKRAR.Konu08_IfCumleleri;

import java.util.Scanner;

public class C05_BagimsizIfCumleleriSonucKontrolu {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
//girilen sayılara göre asagıdaki degerlendirmeleriyazdırın
 //1-sayi1<sayi2 ise "birinci  sayi daha kucuk"
 //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"
 //3- sayi2 50 den buyuk ise "ikinci sayı 50 den buyuk"
 //4-sayi 5 ilr bolunrbiliyorsa "ikinci  sayı 5 in tam kati"
 //5- eger konsolde yukarıdakilerin HICBIRI yazdırılmasa
 // "nasıl sayı sectiniz , hicbir sarti sağlamayor" yazdırın

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
            System.out.println();
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


if(!(girilenSayi1>0) && !(girilenSayi2>50)&& !(girilenSayi2%5==0)&& !(girilenSayi1<girilenSayi2)){

    System.out.println("nssıl sayı bu ya");

}





    }
}
