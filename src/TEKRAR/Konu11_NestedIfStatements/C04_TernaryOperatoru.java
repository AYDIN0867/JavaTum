package TEKRAR.Konu11_NestedIfStatements;

import java.util.Scanner;

public class C04_TernaryOperatoru {

    public static void main(String[] args) {

   //kullanicidan pozitif bir tamsayı alın
   //safi çift ise "çift sayi", çift değilse "tek sayi" yazdirin
   //

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        double girilenSayi = scanner.nextDouble();

        //if-else ile yapalım

        if (girilenSayi%2==0){

            System.out.println("girilen sayi çiftttir");

        }else System.out.println("girilen sayi tektir");


        //ternary ile yapalım

        System.out.println(girilenSayi%2==0 ? "çift sayi" :"teksayi");

    }
}
