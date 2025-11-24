package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C06_RakamlarToplamı {
    public static void main(String[] args) {

        //Kullanıcıdan pozitif bir tamsayi alip, rakamlar toplamını asagidaki gibi yazdirin...
        // input: 1453 output => 1+4+5+3= 13
        // output: "Girilen 1453 sayisinin rakamlar toplami : 13"


        Scanner scanner=new Scanner(System.in);
        System.out.println("Rakamlar toplamını bulmak için pozitif bir tamsayi giriniz...");
        int girilenSayi=scanner.nextInt();


        int basamakSayisi=(girilenSayi+"").length();
        int basamakToplami=0;
        int sayi=girilenSayi;
        System.out.print("Girilen "+girilenSayi+ "nın rakamları toplamı :");

        for (int i = 1; i <=basamakSayisi ; i++) {

            basamakToplami+=sayi%10;
            sayi/=10;

        }
        int birlerBasamgı=girilenSayi%10;
        girilenSayi/=10;
        int onlarBasamagı=girilenSayi%10;
        girilenSayi/=10;
        int yüzlerBasamgı=girilenSayi%10;

        System.out.print(yüzlerBasamgı+"+"+onlarBasamagı+"+"+birlerBasamgı);

        System.out.print("= "+basamakToplami);







    }
}
