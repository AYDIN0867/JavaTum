package TEKRAR.Konu03_KullanıcıdanDataAlma;

import java.util.Scanner;

public class D02_KullanicidanBilgiAlipYazdirma {
    public static void main(String[] args) {

        //Soru kullanicidan ismini,soyismini,ve yasini alip,
        //asagidaki formatta yazdirin...
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz : ");
        String isim=scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz : ");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen yasinizi giriniz : ");
        byte yas=scanner.nextByte();
        System.out.println("Isminiz :"+isim +
                "\nsoyisminiz : "+soyIsim+
                "\nYasiniz : "+yas+
                "\nKaydiniz basariyla tamamlanmıstır."

        );












    }
}
