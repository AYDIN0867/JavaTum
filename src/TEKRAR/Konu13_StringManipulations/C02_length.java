package TEKRAR.Konu13_StringManipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {


        //java compile time olarak çalışır syntext e bakar hata yoksa yazımda hata vermez...
        //ama kod açlıştırıldıgında StringIndexOutOufBound exception hatası verir...

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz....");
        String str =scanner.nextLine();
        System.out.println(str.length());// ramazan =7

        //girilen metnin son karakterini belirtin

        System.out.println(str.charAt(str.length() - 1));//n

        /*
         baştan 5. karakter icin str.charAt(5-1)
         sondan 5. karakter icin str.charAt(str.length()-5) kullanılır

         */

//baştann 3. karakterini yazdırın

        System.out.println(str.charAt(2));

// sondan 3. karakterini yazdirin
        System.out.println(str.charAt(str.length() - 3));

//metindeki baştan 2. ve sondan 3. karakteri yan yana yazdirin...

        System.out.println(""+str.charAt(1) + str.charAt(str.length()-3));

    }
}
