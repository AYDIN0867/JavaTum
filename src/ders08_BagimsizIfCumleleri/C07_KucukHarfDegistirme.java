package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class C07_KucukHarfDegistirme {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter girinşiz");
        char harf1 = scanner.next().charAt(0);

        if (harf1>='a'&&harf1<='z') {

            harf1 = Character.toUpperCase(harf1);
            System.out.println(harf1);

       // A:65 a:97
       //B:66  b:98 aralarındaki fark 32

        }else {

            System.out.println(harf1);
        }
        


    }
}
