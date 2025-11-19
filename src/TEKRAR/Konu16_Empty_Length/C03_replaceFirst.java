package TEKRAR.Konu16_Empty_Length;

import java.util.Scanner;

public class C03_replaceFirst {
    public static void main(String[] args) {

        String cumle="Java ile yazilim dünyasina giris yaptim";
        // sadece ilk "a" harfini "A" ile değiştirin
        System.out.println(cumle.replaceFirst("a", "A"));

        // sadece ilk "e" harfini "E" ile değiştirin

        System.out.println(cumle.replaceFirst("e", "E"));

       // Kullanıcıdan bir cumle isteyin
       // eger cumle icinde rakam varsa, ilk rakam yerine X yazin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz...");

        String metin=scanner.nextLine();

        if (metin.matches(".*\\d.*")){

            System.out.println(metin.replaceAll("\\d", "x"));
        }



        /*
        REGEX regular expression ==>
        \\d bir rakam (0-9)


         */




    }
}
