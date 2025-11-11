
package TEKRAR.Konu12_SwitchStatements;

import java.util.Scanner;

public class C03_IkiBasamakliSayiyiYazdirin {
    public static void main(String[] args) {

        //Kullanicidan 100 den kucuk pozitif bir tamsayi alip, girilen sayiyi yazi ile yazdirin...

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk pozitif bir sayı giriniz...");
        int sayi=scanner.nextInt();
//tüm hataları engellemek için if else ekleyelim

        if (sayi<0&&sayi<100) {
            int birlerBasamgi = sayi % 10;
            int onlarBasamgi = sayi / 10;

            switch (onlarBasamgi) {

                case 0:
                    break;
                case 1:
                    System.out.print("On");
                case 2:
                    System.out.print("Yirmi");
                case 3:
                    System.out.print("Otuz");
                case 4:
                    System.out.print("Kırk");
                case 5:
                    System.out.print("Elli");
                case 6:
                    System.out.print("Atmış");
                case 7:
                    System.out.print("Yetmiş");
                case 8:
                    System.out.print("Seksen");
                case 9:
                    System.out.print("Doksan");

            }

            System.out.print(" ");

            switch (birlerBasamgi) {

                case 0:
                    break;
                case 1:
                    System.out.print("bir");
                case 2:
                    System.out.print("iki");
                case 3:
                    System.out.print("üç");
                case 4:
                    System.out.print("dört");
                case 5:
                    System.out.print("beş");
                case 6:
                    System.out.print("altı");
                case 7:
                    System.out.print("yedi");
                case 8:
                    System.out.print("sekiz");
                case 9:
                    System.out.print("dokuz");


            }

        }else System.out.println("hatalı giriş");







    }
}
