package TEKRAR.Konu10_IfElseIf;

import java.util.Scanner;

public class C03_VücutKitleEndeksi {
    public static void main(String[] args) {

//Soru2 - kullanıcının kilo (kg) ve boyunu (cm) isteyip vücut kitle endeksini
// hesaplayın kilo*10000 /(boy*boy)
// vücut kitle endeksi
// 30 dan buyükse obez
// 25-30 arasi kilolu
// 20-25 arasi ise normal
// 20 den kucukse zayif yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("lütfen boyunuzu cm olarak giriniz....");
        double boy=scanner.nextDouble();

        double vücutKitleEndeksi=kilo*10000/(boy*boy);

        if (vücutKitleEndeksi<20){
            System.out.println("ZAYIF");
        } else if (vücutKitleEndeksi<25) {
            System.out.println("NORMAL");
        } else if (vücutKitleEndeksi<30) {
            System.out.println("KİLOLU");
        } else System.out.println("OBEZSIN DOSTUM");


    }
}
