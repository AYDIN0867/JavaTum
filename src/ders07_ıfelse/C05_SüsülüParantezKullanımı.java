package ders07_ıfelse;

import java.util.Scanner;

public class C05_SüsülüParantezKullanımı {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Lutfen bir tamsayi giriniz...");
        //        int sayi = scanner.nextInt();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen  2 tamsayı giriniz");

        int sayi1=scanner.nextInt();

        if (sayi1%3==0){

            System.out.println("üç ile bölünür");
            System.out.println("3 ile bölünme ekstra satır");

        }

             if (sayi1%5==0){

                 System.out.println("beş ile bölünür");
                 System.out.println("beş ile bölünme ekstra satır");
             }



// eğer süsülü parantez kullanmaz ise if body olarak sadece ilk noktalı virgüle kadar olan kısmı alır
        //geriye kalan if ile ilgili olmaz


        // aynı sayı 4 ile bölünüyrsa 4 ile bölünür yazsın

        if (sayi1%4==0) System.out.println("4 ile bölünür");


        // eğer if body si tek bir satır ise
        //süslü parantez kullanmaya biliriz ama birden fazla satırdan kod varsa
        //süsülü parantez kualanırız
    }
}
