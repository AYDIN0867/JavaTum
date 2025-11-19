package TEKRAR.SorularStringManipulations;

import java.util.Scanner;

public class C01_SorularStringManipulations {
    public static void main(String[] args) {

        // Kullanicidan belirli bir formatta verdiği String fiyatlari toplayip yazdirin...

        // input1 : "15.30 €", input2: "11.45 € "
        // output : 26.75 €
        // Not: sondaki para birimi degisken olamalidir...

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ilk fiyatı giriniz....");
        String fiyat1=scanner.nextLine();
        System.out.println("lütfen ikinci fiyatı giriniz...");
        String fiyat2=scanner.nextLine();
        System.out.println("lütfen parabirimini giriniz");
        String paraBirimi=scanner.nextLine();
        fiyat1=(fiyat1.replaceAll("D",""));
        fiyat2=fiyat2.replaceAll("D","");
        double fiyatYeni1=Double.parseDouble(fiyat1);
        double fiyatYeni2=Double.parseDouble(fiyat2);
        System.out.println("fiyatlarin Toplami : "+(fiyatYeni1+fiyatYeni2)+paraBirimi);




    }
}
