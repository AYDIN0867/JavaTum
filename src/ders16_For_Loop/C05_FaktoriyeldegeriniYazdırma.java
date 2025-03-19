package ders16_For_Loop;

import java.util.Scanner;

public class C05_FaktoriyeldegeriniYazdırma {

    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 17 den küçük bir pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        int faktoriyelCarpim=1;
        System.out.print(sayi+"!=");
        for (int i = sayi; i >=2; i--) {

            faktoriyelCarpim*=i;

            System.out.print(i+"*");

        }

        System.out.println("1"+"="+faktoriyelCarpim);







    }
}
