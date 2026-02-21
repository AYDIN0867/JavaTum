package TEKRAR.Konu.Konu13_StringManipulations;

import java.util.Scanner;

public class C04_SifreKontrolu {
    public static void main(String[] args) {

        // kullanıcıdan şifre oluşturmak üzere sifre isteyin
        // sifreyi iki kere isteyin
        // eger metin  aynı oldugu halde yazım farklılıgı varsa
        // "Lütfen yazimi kontrol edin "yazdırın...
        //  Eger karakter farkliliği varsa
        // "Girilen sifreler farkli" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz....");
        String sifre = scanner.nextLine();
        System.out.println("Lütfen sifrenizi tekrar giriniz...");
        String sifreYeniden = scanner.nextLine();

        if (sifre.equalsIgnoreCase(sifreYeniden)) {

            System.out.println("lütfen yazimi kontrol edin");

        } else System.out.println("şifreler farkli");

    }


}



