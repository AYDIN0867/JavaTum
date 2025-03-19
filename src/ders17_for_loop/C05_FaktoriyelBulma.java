package ders17_for_loop;

import java.util.Scanner;

public class C05_FaktoriyelBulma {


    public static void main(String[] args) {

// Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 17 den küçük bir pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        int faktoriyelCarpim=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyelCarpim*=i;

        }

        System.out.println(sayi+"!= "+faktoriyelCarpim);



    }
}
