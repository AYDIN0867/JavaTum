package ders08_BagimsizIfCumleleri;

import java.util.Scanner;

public class C05_SinifGecmeSoru {

    public static void main(String[] args) {

        // kullanıcıdan notu alın notu 50 veya dah büykse sinıfı geçtin yazın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunuzu girinşiz");
        double girilenNot=scanner.nextDouble();
if (girilenNot>50){

    System.out.println("sinifi gectin");
}else {

    System.out.println("malesef kaldın");
}


    }
}
