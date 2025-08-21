package TEKRAR.Konu03_KullanıcıdanDataAlma;

import java.util.Scanner;

public class D03_DikdörtgenAlaniHesaplama {
    public static void main(String[] args) {

    //Soru 4-Kullanıcıdan bir dikdörtgenin 2 kenar uzunlıgunu alıp
    //dikdörtgen alanini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");
        System.out.print("Kısakenar : ");
        double kısaKenar= scanner.nextDouble();
        System.out.print("UzunKenar : ");
        double uzunKenar=scanner.nextDouble();
        System.out.println("Dikdörtgenin Alanı : "+ (kısaKenar*uzunKenar)+" metrekare");














    }//main method sonu






}
