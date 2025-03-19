package ders10_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tamsayı alın
        // sayi cift ise "çift sayı", çift değilse "tek sayi" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        // if else ile yapalım

        if (sayi%2==0) System.out.println("cift sayi");
        else System.out.println("teksayi");


        // ternary ile yapalim

        System.out.println(sayi%2==0? "cift sayi":"tek sayi");







    }
}
