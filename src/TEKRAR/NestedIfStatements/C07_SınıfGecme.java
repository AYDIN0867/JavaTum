package TEKRAR.NestedIfStatements;

import java.util.Scanner;

public class C07_SınıfGecme {

    public static void main(String[] args) {

        // Kullancidan notu alin
        // 50 veya daha buyukse "Sinifi Gectin"
        // 50 den küçükse "Malesef Kaldin"


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double girilenNot = scanner.nextDouble();

        System.out.println(girilenNot>=50 ? "Sinifi Gectin" : "Malesef kaldın"); //kodlama tek satirda oluyorsa ternary kullanılır



    }
}
