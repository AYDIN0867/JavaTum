package ders13_String_manipulations;

import java.util.Scanner;

public class C12_Soru {
    public static void main(String[] args) {

     // /*
        //        SORU : kullanicidan bir mail alin
        //
        //         - mail @ icermiyorsa "gecersiz mail"
        //                - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //        yazdirin.
        //
        //       */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin=scanner.nextLine();

        if (!metin.contains("@")){

            System.out.println("gecersiz mail");
        } else if (!metin.contains("@gmail.com")) {

            System.out.println("mail gmail olamali");

        } else if (!metin.endsWith("@gmail.com")) {

            System.out.println("mailde yazım hatası var ");

        }


    }
}
