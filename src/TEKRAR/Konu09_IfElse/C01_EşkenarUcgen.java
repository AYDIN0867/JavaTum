package TEKRAR.Konu09_IfElse;

import java.util.Scanner;

public class C01_EşkenarUcgen {

    public static void main(String[] args) {
/*
Kullanıcıdan 3 adet kenar uzunluğu alın,
kenar uzunlukları eşit ise "üçgen eşkenar üçgen " yazdırın
DEĞİLSE "üçgen eşkenar DEĞİL" dir yazdırın...

 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarını giriniz...");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

if (kenar1==kenar2&&kenar2==kenar3&&kenar1>0){

    System.out.println("girilen kenar değerlerine göre üçgen eşkenarır");
}else System.out.println("girilen kenar değerlerine göre üçgen eşkenar değildir");







    }
}
