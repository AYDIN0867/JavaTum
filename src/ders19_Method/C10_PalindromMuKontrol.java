package ders19_Method;

import ders20_Method_Sorular.C05_MetniTerseCevirme;

public class C10_PalindromMuKontrol {

    public static void main(String[] args) {

        //verilen metnin palindrom olup olmadıgını kontrol edin
        //palindrom ise true değil se false donduıren bir metod olusturn


        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("1235321"));
    }

    //false
    public static boolean isPalindrome (String metin){

        String tersMetin= C05_MetniTerseCevirme.metnintersiniDondur(metin);

        if (metin.equalsIgnoreCase(tersMetin)){

            return true;
        }else {

            return false;
        }



    }



}
