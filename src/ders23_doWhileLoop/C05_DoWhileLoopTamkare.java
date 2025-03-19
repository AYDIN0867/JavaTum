package ders23_doWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoopTamkare {

    public static void main(String[] args) {


        // kullanıcıdan pozitif bir tamsa yı isteyiniz,
        //sayının tam kare olup olmadığını bulunuz
        // tam kare ise true değilse false yazdırınız
        //Örnek: input: 14(4*4), output :true



        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir bir tamsayı giriniz");
        int sayi =scanner.nextInt();

        int karekok=1;

        do{

        if (karekok*karekok==sayi){

            System.out.println("true");
            break;
        }

            karekok++;
        if (karekok*karekok>sayi){

            System.out.println("false");
            break;
        }

        }while (karekok*karekok<=sayi);




    }
}
