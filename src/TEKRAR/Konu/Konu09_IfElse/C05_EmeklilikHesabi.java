package TEKRAR.Konu.Konu09_IfElse;

import java.util.Scanner;

public class C05_EmeklilikHesabi {
    public static void main(String[] args) {

        //Kulalnıcıdan yaşını isteyiniz
        //eger yasşi 65 ve üzeri ise "emekli olabilirsin " yazdırın
        //değilse kaç sene daha çalışması gerektiğini yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir yaşınızı giriniz");

        double girilenYas=scanner.nextDouble();

        if (girilenYas>=65){

            System.out.println("emekli olabilirsiniz");


        }else System.out.println((65-girilenYas) + " daha yıl çalışmanız gerekiyor");




    }
}
