package TEKRAR.Konu09_IfElse;

import java.util.Scanner;

public class C02_SinifGecme {
    public static void main(String[] args) {

        //kullanıcıdan notunu alın
        //notu 50veya buyukse "sinifi gectin" yazdırın
        // not 50 den büyük değilse "kaldı " yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz....");
        double girilenNot=scanner.nextDouble();

        if (girilenNot>50){

            System.out.println("GECTINIZ");
        }else System.out.println("KALDINIZ");




    }
}
