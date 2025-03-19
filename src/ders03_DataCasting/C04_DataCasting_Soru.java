package ders03_DataCasting;

import java.util.Scanner;

public class C04_DataCasting_Soru {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin;
        // sayilari biribirine bölüp, işlem sonucunu ondalikli olarak yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki adet pozitif tamsayi giriniz");

        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        double bolum=(double)sayi1/sayi2; // önce bölme işlemini yapar 4  ü nbulur bunun
        // double hali yani yazdırdığı sonun 4.0 olur


        System.out.println(bolum);

        // java da iki tamsayıyı birbirine bölerseniz java işlem sonucunun tamsayi kısmını alır
        //not : bir tamsayıyı 10 a bölersek birler basamağını silmiş oluruz


    }
}
