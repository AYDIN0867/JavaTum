package ders16_For_Loop;

import java.util.Scanner;

public class C06_RakamlarToplamı {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int girilenSayi=scanner.nextInt();
        int basamaksayisi=(girilenSayi+"").length();
        int birlerBasamagi=0;
        int rakamlarToplamı=0;
        int sayi=girilenSayi;
        for (int i = 1; i <=basamaksayisi ; i++) {

              birlerBasamagi=sayi%10;
              rakamlarToplamı+=birlerBasamagi;
              sayi/=10;

        }

        System.out.println(rakamlarToplamı);





    }
}
