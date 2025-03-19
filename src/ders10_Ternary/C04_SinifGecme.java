package ders10_Ternary;

import java.util.Scanner;

public class C04_SinifGecme {


    public static void main(String[] args) {
        // kullanıcıdan notunu alma
        // 50 veya daha büyükse "sinifi gectin"
        //50'den kucukse "malesef kaldın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen  notunuzu giriniz");
        double sayi=scanner.nextDouble();


        System.out.println(sayi>=50?"sinifi gectin":"kaldın moruk");





    }
}
