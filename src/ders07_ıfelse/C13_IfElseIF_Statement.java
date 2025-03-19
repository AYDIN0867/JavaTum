package ders07_ıfelse;

import java.util.Scanner;

public class C13_IfElseIF_Statement {

    public static void main(String[] args) {
        /*
     ikiden fazla ihtimalin mümkün olduğı durumlarda

     if ile ilk durumu
     else if ile ikinci durumu
     .
     .
     .
      tüm ihitmallaer bitince

      else kullanılır

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        System.out.print("1. kenar :");
        double kenar1 = scanner.nextDouble();
        System.out.print("2.kenar :");
        double kenar2 = scanner.nextDouble();
        System.out.print("3. kenar");
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2&&kenar1==kenar3)
            System.out.println("ölçülerini giridğiniz üçgen bir eşkenar üçgendir");
        else if (kenar1==kenar2 ||kenar1==kenar3||kenar2==kenar3) {

            System.out.println("ikizkenar");

        }else{ // else yazılabilmesi için tüm ihtimallerin bitmesi lazım
            System.out.println("çeşitkenar");
        }

    }
}
