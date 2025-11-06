package TEKRAR.Konu09_IfElseIf;

import java.util.Scanner;

public class C03_BüyükHarfKontrolü {
    public static void main(String[] args) {

        /*

        Kullanicidan bir harf girmesini isteyin
        girilen harfin buyuk yada kucuk oldugunu yazdirin


         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scanner.next().charAt(0);
       // String girilenHarf=scanner.nextLine().substring(0,1);

        if (harf>='A'&&harf<='Z'){
            System.out.println("girilen harf buyük harftir");
        }else System.out.println("girilen Harf KUCUKTUR");


        if (Character.isUpperCase(harf)){

            System.out.println("girilen harf büyük");
        }else System.out.println("girilen harf küçük...");


    }
}
