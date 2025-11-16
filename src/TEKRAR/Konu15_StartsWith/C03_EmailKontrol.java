package TEKRAR.Konu15_StartsWith;

import java.util.Scanner;

public class C03_EmailKontrol {
    public static void main(String[] args) {

//SORU : kullanıcıdan bir mail alin
        // -mail @ içermiyorsa " gecersiz mail"
        // -mail @gmail icermiyorsa "mail gmail olmali"
        // -mail @gmail.com ile bitmiyorsa, "mailde yazim hatası var" yazdirin...


 /*
 Eger tum kontrolleri yapmasini ve hataları yazdırmasini istersek BAGIMSIZ IF
 cumleleri
 eger buldugu ilk hatayı yazdırsın, ilk hata düzeltildikten sonra diğer şartları kontrol etsin diyorsanız
  */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen emailinizi giriniz...");

        String email=scanner.nextLine();

        if (!email.contains("@")){

            System.out.println("gecersiz mail");

        } else if (!email.contains("@gmail")) {

            System.out.println("mail gmail içermeli");

        } else if (!email.endsWith("@gmail.com")) {

            System.out.println("mailde yazim hatası var");

        }else System.out.println("email gecerli");


    }
}
