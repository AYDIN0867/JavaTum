package TEKRAR.Konu.Konu08_IfCumleleri;

import java.util.Scanner;

public class C02_EskenarUcgeninKontrolu {
    public static void main(String[] args) {

        //kullanıcıdan bir ucgenin kenar uzunluklarını alınız
        //kenar uzunlukları birbirine esşit ise "Eskenar ucgen" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarını giriniz...");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

// if(kenar1==kenar3==kenar2) javada 3 lü karşılaştırma olmaz....

        /*
        if(kenar1==kenar3 && kenar2==kenar3){

            System.out.println("ücgen bir eskenar ucgendir...");
        }

burda kullanıcıdın gıcıklık hakkının oldugunu düşünerek kenar uzunluklarının
0 ve eksi değer verilmesini de düşünerek kodumuzu güncelleyelim

         */



        if(kenar1==kenar3 && kenar2==kenar3 && kenar1>0){

            System.out.println("ücgen bir eskenar ucgendir...");
        }

        //kenar2>0,kenar3>0 de diyebiliriz...

    }
}
