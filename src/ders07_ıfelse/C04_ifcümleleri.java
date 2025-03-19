package ders07_ıfelse;

import java.util.Scanner;

public class C04_ifcümleleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 2 tamsayı giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1<sayi2 ise  birinci sayı daha küçük yazdırın

        if (sayi1 < sayi2) {
            System.out.println("birinci sayı daha küçük");
        }

        if (sayi1 > 0) {

            System.out.println("birinci sayı sıfırdan büyük");

        }


        if (sayi2 > 50) {

            System.out.println("ikinci sayı 50 den büyük");
        }


    }
}
