package ders13_String_manipulations;

import java.util.Scanner;

public class C09_Soru {

    public static void main(String[] args) {

        //kullanıcıdan mit metin isteyin
        //metin ev içeriyorsa "ev gibisi var mı"
        //metin is içeriyorsa çalışmak ne güzel
        //metin hem ev hem is içeriyorsa evden çalışmak ne güzel
        //metin bu iki kelimeyide içermiyorsa "çok çalışmak lazım çokk yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin=scanner.nextLine().toLowerCase();

          if (metin.contains("ev")&& metin.contains("is")){

            System.out.println("evden çalışmak ne güzel");

        }


       else if (metin.contains("ev")){

            System.out.println("ev gibisi varmı");
        }

        else if (metin.contains("is")){

            System.out.println("calışmak ne güzel");
        }

      else{

            System.out.println("çok çalışmak lazım çoookkkk");
        }



    }
}
