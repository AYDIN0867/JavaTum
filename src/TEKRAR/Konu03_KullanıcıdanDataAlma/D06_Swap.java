package TEKRAR.Konu03_KullanıcıdanDataAlma;

import java.util.Scanner;

public class D06_Swap {
    public static void main(String[] args) {

        //Soru 7 -Kullaıcıdan iki sayı alıp
        //ikisinin degerini degistirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı giriniz");
        int IlkSayi=scanner.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int IkinciSayi=scanner.nextInt();


        int degisimci=0;

        degisimci=IlkSayi;
        IlkSayi=IkinciSayi;
        IkinciSayi=degisimci;

        System.out.println("ilk sayinin yenidegeri : "+IlkSayi+"\nikinciSayinin yeni degeri:  "+IkinciSayi);




    }
}
