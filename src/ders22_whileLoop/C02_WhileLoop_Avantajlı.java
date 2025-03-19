package ders22_whileLoop;

import java.util.Scanner;

public class C02_WhileLoop_Avantajlı {

    public static void main(String[] args) {

//kullanıcıya istediği kadar pozitif sayı girmesini soyleyin
// girilen sayilar pozitif ise sayıyı toplama ekleyin
        //girilen sayi negatif ise uyarı verin ve sayiyi işleme almayın
        //girilen sayi 0 olduğunda işlemi bitirin
        // ve kac tane pozitif sayi girildiğini
        // ve toplamlarının kaç olduğunu yazdırın


        Scanner scannner=new Scanner(System.in);

        int sayi1=10; //sıfırın dışında bir sayıyı veriyoruz çünkü
        // o olduğunda kodun bitmesi isteniyor
        int toplam=0;
        int count=0;

while (sayi1!=0){

    System.out.println("lütfen toplamak üzere pozitif bir sayı veriniz"+"\nbitirmek için 0 a basiniz") ;


    sayi1=scannner.nextInt();
    if (sayi1>0){

        toplam+=sayi1;
        count++;
    } else if (sayi1<0) {

        System.out.println("girilen sayı kabul edilemz");


    }

}

        System.out.println("girirlen "+count+"adet pozitif tamsayının toplamı :"+toplam);

    }
}
