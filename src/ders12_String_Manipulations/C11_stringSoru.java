package ders12_String_Manipulations;

import java.util.Scanner;

public class C11_stringSoru {

    public static void main(String[] args) {

      /*
        SORU : kullanicidan bir mail alin

         - mail @ icermiyorsa "gecersiz mail"
                - mail @gmail.com icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.

       */
        Scanner scanner=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String girilenMail=scanner.nextLine();

        if (!girilenMail.contains("@")){

            System.out.println("geçersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {

            System.out.println("mail gmail olmali");

        }else if (girilenMail.endsWith("@gmail.com")){

            System.out.println("mailde yazim hatası ");
        }


    }
}
