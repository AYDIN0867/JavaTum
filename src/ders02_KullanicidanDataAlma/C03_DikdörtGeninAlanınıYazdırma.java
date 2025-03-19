package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdörtGeninAlanınıYazdırma {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin Kenar Uzunluklarını Giriniz");

        double uzunKenar=scanner.nextDouble();
        double kisaKenar=scanner.nextDouble();

        System.out.println("dikdörtgenin alanı " +"\n"+(uzunKenar*kisaKenar));






    }
}
