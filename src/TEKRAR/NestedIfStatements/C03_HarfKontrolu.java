package TEKRAR.NestedIfStatements;

import java.util.Scanner;

public class C03_HarfKontrolu {
    public static void main(String[] args) {

      //Kullanıcıdan bir karakter girmesini isteyin
      //kullanıcı kucuk harf girerse
        // - a ise "güzel harf"
        //  -b,c veya d ise "idare eder"
        // diğer kucuk harfler icin " girilen kucuk harfi begenmedim "yazdirin
        //Kullanıcı buyuk harf girerse
        // -K ise "güzel harf"
        //- L, V veya Z ise " idare eder"
        // - diger buyuk harfler icin "girilen buyuk harfi begenmedim " yazdırın

        //Kullanıcı harfler dısında bir karakter girerse
        // - "Tanımlanmamıs karakter" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scanner.next().charAt(0);

        if (Character.isLowerCase(harf)){

            if (harf=='a'){

                System.out.println("güzel harf");

            } else if (harf=='b'||harf=='c'||harf=='d') {

                System.out.println("idare eder");

            }else System.out.println(" girilen kucuk harfi begenmedim ");


        } else if (Character.isUpperCase(harf)) {

            if (harf=='K'){

                System.out.println("güzel harf");

            } else if (harf=='L'||harf=='V'||harf=='Z') {

                System.out.println("idare eder");

            }else System.out.println(" girilen buyuk harfi begenmedim ");



        }else System.out.println("Tanımlanmamıs karakter");



    }
}
