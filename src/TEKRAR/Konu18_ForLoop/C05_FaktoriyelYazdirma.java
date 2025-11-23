package TEKRAR.Konu18_ForLoop;

import java.util.Scanner;

public class C05_FaktoriyelYazdirma {
    public static void main(String[] args) {
        // Kullanicidan  17 den küçük bir sayi alip integerin sınırını aşmasın diye
        // bu sayinin bu sayinin faktöriyel degerini hesaplayın
        // konsolde faltoriyel hesabının yapılıısı da yazdırın
        // Or :6! = 6*5*4*3*2*1 = 720


        Scanner scanner=new Scanner(System.in);
        System.out.println("faktoriyel hesaplamak için pozitif bir tamsayı giriniz...");
        int sayi=scanner.nextInt();
        int faktoriyelDegeri=1;


        System.out.print(sayi+"! = ");

        for (int i = sayi; i>2 ; i--) {

            faktoriyelDegeri*=i;

            System.out.print(i+" *");
        }

        System.out.print("1= "+ faktoriyelDegeri);



}






    }

