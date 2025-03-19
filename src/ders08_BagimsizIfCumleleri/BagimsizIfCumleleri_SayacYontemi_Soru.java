package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class BagimsizIfCumleleri_SayacYontemi_Soru {

    public static void main(String[] args) {

      //kullanıcıdan iki atmsayı isteyin
      // girilen sayi1 ve sayi2 için aşağıdaki şartları kontrol edin
      //ve hiç bir şartı sağlamıyorsa "sayılar uygun değil" yazdırın
      // eger sayılar tüm şartları sağlıyorsa "sayılar mükemmmel yazdırın






        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        System.out.print("birinci tamsayı :");
        int sayi1= scanner.nextInt();
        System.out.print("ikinci tamsayıyı giriniz :");
        int sayi2=scanner.nextInt();
        int sayac=0;
        // sayi1<sayi2 ise "birinci sayi daha kuçuk"

        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kuçuk");//birinci sayi daha kuçuk
            sayac++;
        }
        // sayi1 pozitif ise "birinci sayi sifirdan buyuk"

        if (sayi1>0){

            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;

        }

        //sayi2 50 den büyk ise "ikinci sayi 50 den büyük"

        if (sayi2>50){

            System.out.println( "ikinci sayi 50 den büyük");
            sayac++;


        }

        //sayi2 5 ile bölünüyorsa "ikinci sayı 5 in tam kati"
        if (sayi2%5==0){

            System.out.println("ikinci sayı 5 in tam kati");
            sayac++;
        }

if (sayac==0){

    System.out.println("sayilar uygun değil");
}

if (sayac==4){

    System.out.println("sayılar mükemmel");
}





    }
}
