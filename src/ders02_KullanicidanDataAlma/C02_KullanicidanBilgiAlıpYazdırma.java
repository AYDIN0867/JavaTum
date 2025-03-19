package ders02_KullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlıpYazdırma {

    public static void main(String[] args) {


        // soru3- kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formatta yazdirma
        //isim:john
        //Soyisminiz:Doe
        //Yasiniz:44
        // kaydiniz basariyla tamalanmaistir

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz");
        String isim=scanner.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lütfen Yasınızı Giriniz");
        double yas=scanner.nextDouble();

        System.out.println(

                        "isminiz :" +isim+
                        "\nsoyisim: "+soyisim+
                                "\nYasiniz"+yas+




                "\nkaydınız başarı ile tamamlanmıştır");




    }
}
