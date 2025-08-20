package TEKRAR.KullanıcıdanDataAlma;

import java.util.Scanner;

public class D01_KullanicidanDegerAlma {

    public static void main(String[] args) {

        //Kullanıcıdan bilgi almak için Scanner class ını kullanırız...
        //1. adım Scanner objesi oluşturulur
        //Scanner scan=new Scanner(System.in);
        //2. adım kullanıcıdan ne alınmak istediği belirtirili
        // System.out.println("Lütfen bir tamsayi giriniz");


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int girilenyas=scanner.nextInt();
        System.out.println("Girdiginiz yas: "+girilenyas);


//kullanicidan bir double,bir de int sayi alıp bunların toplamını ve carpımını yazdırın


        System.out.println("lütfen ondaliklı bir sayı giriniz....");
        double ondaliklisayı= scanner.nextDouble();
        System.out.println("lütfen tam  sayı giriniz....");
        int tamsayi=scanner.nextInt();
        System.out.println("girdiginiz sayıların carpımı : "+(ondaliklisayı*tamsayi));
        System.out.println("girdiginiz sayıların toplamı : "+(ondaliklisayı+tamsayi));

//






    }
}
