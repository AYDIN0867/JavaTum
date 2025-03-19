package ders11_Switch_Case;

import java.util.Scanner;

public class C04_IkiBasamakli_Sayiyi_Yazi_ile_Yazdirma {

    public static void main(String[] args) {

        // kullanicidan 100 den küçük pozitif bir tamsayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println(" 100 den küçük pozitif bir tamsayi giriniz:");
        int sayi=scanner.nextInt();

        int birlerBasamagi=sayi%10;
        int onlarBasamagi=sayi/10;

        System.out.print("girdiğiniz sayi   :");

        switch (onlarBasamagi){

            case 0:
                break;
            case 1:
                System.out.print("on");
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmis");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;

        }

        System.out.print(" ");

        switch (birlerBasamagi){

            case 0:
                break;
            case 1:
                System.out.println("bir");
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;



        }



    }
}
