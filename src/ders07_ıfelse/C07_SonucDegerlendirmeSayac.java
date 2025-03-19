package ders07_ıfelse;

import java.util.Scanner;

public class C07_SonucDegerlendirmeSayac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tamsayı giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
         int sayac=0;
        // 1- sayi1<sayi2 ise  birinci sayı daha küçük yazdırın

        if (sayi1 < sayi2) {
            System.out.println("birinci sayı daha küçük");
            sayac++;
        }

        if (sayi1 > 0) {

            System.out.println("birinci sayı sıfırdan büyük");
            sayac++;
        }


        if (sayi2 > 50) {

            System.out.println("ikinci sayı 50 den büyük");

            sayac++;
        }




if (sayac==0){

    System.out.println("sayılar uygun");
}

  if (sayac==3){

      System.out.println("sayılar çok gozel");
  }

    }
}

