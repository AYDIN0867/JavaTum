package TEKRAR.Konu04_DataCasting;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

//kullanicidan iki tamsayi alin
//sayilari birbirine bölüp, işlem sonucunu ondalıklı olarak yazdırn

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        double sayi3;

        sayi3=(double)sayi1/sayi2;
        System.out.println("Verdiğiniz sayılıların bolum sonucu : "+sayi3);










    }
}
