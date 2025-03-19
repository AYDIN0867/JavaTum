package ders13_String_manipulations;

import java.util.Scanner;

public class C14_IndeksOffSoru {

    public static void main(String[] args) {


        //kullanıcıdan metin isteyin
        //girilen metin de 2.a nin indeksini yazdırın
        //eğer 2. a yoksa metin 2 a içermeli yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();

        int aIlkndeks=girilenMetin.indexOf('a');
        int aIkinciindeks=girilenMetin.indexOf('a',aIlkndeks+1);

        if (aIkinciindeks>-1){

            System.out.println(aIkinciindeks);
        } else if (aIkinciindeks==-1) {

            System.out.println("metin 2 a içermeli");

        }
    }
}
