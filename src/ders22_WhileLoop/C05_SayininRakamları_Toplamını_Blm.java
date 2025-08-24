package ders22_WhileLoop;

import java.util.Scanner;

public class C05_SayininRakamları_Toplamını_Blm {
    public static void main(String[] args) {

        // while loop kullanarak kullanıcının alınan sayının rakamları toplamını bulun.


        Scanner scanner=new Scanner(System.in);
        System.out.println("rakamları toplamını bulmak için potitif bir sayı gir");
           int girilenSayı=scanner.nextInt();

           int sayi=girilenSayı;
           int rakamlarToplamı=0;
           while (sayi>0){

              rakamlarToplamı+=sayi%10;
              sayi/=10;
           }

        System.out.println("girilen "+ girilenSayı+"rakamlar toplamı  : "+rakamlarToplamı);



    }
}
