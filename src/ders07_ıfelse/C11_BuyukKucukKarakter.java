package ders07_ıfelse;

import java.util.Scanner;

public class C11_BuyukKucukKarakter {

    public static void main(String[] args) {
       //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen bir karakter girinşiz");
        char harf1=scanner.next().charAt(0);
// ASCII Tablosuna göre

        if (harf1>='A'&&harf1<='Z'){

            System.out.println("girdiğiniz karakter büyük harf ");
        }else{

            System.out.println("girdiğiniz karakter büyük harf değil");
        }


        // wrapper class

        if (Character.isUpperCase(harf1)){

            System.out.println("girdiğiniz karakter büyük harf ");
        }else {

            System.out.println("girdiğiniz karakter büyük harf değil");
        }



    }
}
