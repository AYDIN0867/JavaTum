package ders09_If_Nested_Else_If;

import java.util.Scanner;

public class C11_HarfKontrolu {

    public static void main(String[] args) {
        // kullanıcıdan bir karakter girmesini isteyin
        // kullanıcı kucuk harf girerse;
            // a ise "güzel harf"
            // b,c veya d ise "idare eder
           // diger kucuk harfler icin "girilen kucuk harfi begenmedim"

        // Kullanıcı Büyük harf girerse;
          // K ise "güzel harf"
          //L,V veya Z ise "idare eder"

        //Kullanıcı harfler dışında bir karakter girerse
          //- "tanımlanmamış karakter" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen bir karakter girin :");
        char girilenKarakter=scanner.next().charAt(0);

        if ('a'<=girilenKarakter&&'z'>=girilenKarakter){

            if (girilenKarakter=='a'){

                System.out.println("güzel harf");

            } else if (girilenKarakter=='b'||girilenKarakter=='c'||girilenKarakter=='d') {

                System.out.println("idare eder");

            }else {

                System.out.println("girilen küçük harfi begenmedim");
            }


        } else if ('A'<=girilenKarakter&&'Z'>=girilenKarakter) { // Burada bu kodun yerine Character.isUpperCase(girilenKarakter)
            // de yazabilirdik ve aynı sonucu verir di

            if (girilenKarakter=='K'){

                System.out.println("güzel harf");

            } else if (girilenKarakter=='L'||girilenKarakter=='V'||girilenKarakter=='Z') {

                System.out.println("idare eder");
            }else {

                System.out.println("girilen büyük harfi begenmedim");
            }


        }else {

            System.out.println("lütfen tanımlanmış karakter yazdırın");
        }


    }
}
