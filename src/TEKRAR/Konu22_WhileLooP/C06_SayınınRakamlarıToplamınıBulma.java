package TEKRAR.Konu22_WhileLooP;

import java.util.Scanner;

public class C06_SayınınRakamlarıToplamınıBulma {
    public static void main(String[] args) {

       //while loop kullanarak kullanıcadan alınan sayının rakamları toplamını bulun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Rakamlar toplamını bulmak için pozitif bir tamsayı giriniz...");
        int girilenSayi=scanner.nextInt();
        int sayi=girilenSayi;//girilen sayının sayı variablesine atanmasının sebebi eger while loop a girlensayıyı girse idik
        //sayı kullanıldıgından girilen sayı son durumda 0 kalmış olacaktı işlemlerden etkilenmememi için sayı ya atadık...
        int rakamlarToplamı=0;
        while (sayi!=0&&sayi>0){

            rakamlarToplamı+=sayi%10;
            sayi/=10;

        }

        System.out.println("girilen sayıların toplamı :" +rakamlarToplamı);








    }
}
