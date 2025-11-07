package TEKRAR.Konu10_IfElseIf;

import java.util.Scanner;

public class C01_DersGecme {

    public static void main(String[] args) {

        //birden fazla kontrol etmemiz gerektiğinde kullanırız
        //Ve burda doğru sıralama çok önemlidir

        /*

        Ogrencinin notunu alınız
        Eger ogrencinin notu 85 ve üstü ise AA
        65 ve üstü ise BB
        50 VE üstü ise CC
        geriye kalanlar DD olsun


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double girilenNot = scanner.nextDouble();

        if (girilenNot >= 85) {
            System.out.println("AA ile gectiniz");
        } else if (girilenNot>=65) {
            System.out.println("BB ile gectiniz");
        } else if (girilenNot>=50) {
            System.out.println("CC ile gectiniz");
        }else System.out.println("ne oldugunuz belli değil");
    }
}