package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class C06_BuyukHarfKontrolu {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter girinşiz");
        char harf1 = scanner.next().charAt(0);
        // 1. yöntem ASCII Tablosuna göre
// char data türü amtematiksel işlemlerde ascii table dkid eğerlerine göre işlem yapar
        // byük küçük vb karşılaştırmada char ascii değerlerimnni alır

        if (harf1 >= 'A' && harf1 <= 'Z') {

            System.out.println("girilen karakter");
        } else {

            System.out.println("girilen harf büyük değil");
        }

// 2 .yöntem karakter wrapper class özellikleri ile kodlayabilşriz

        if (Character.isUpperCase(harf1)){

            System.out.println("girilen harf büyük");
        }else {

            System.out.println("büyükharf değil");
        }




    }


}
