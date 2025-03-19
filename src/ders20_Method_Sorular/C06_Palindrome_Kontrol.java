package ders20_Method_Sorular;

public class C06_Palindrome_Kontrol {

    public static void main(String[] args) {

        //verilen metnin palindrome olup olmadığını kontrol edip,
        // palinrome ise true, palindrome değilse false döndüren bir method oluşturun


        System.out.println(isPalindrome("java"));//false

        System.out.println(isPalindrome("madam"));//true

    }


       public static boolean isPalindrome(String metin){

           String terMetin=C05_MetniTerseCevirme.metnintersiniDondur(metin);

           if(metin.equalsIgnoreCase(terMetin)){

               System.out.println("verilen metin palindrom");

               return true;
           }else{

             return false;
           }



       }




}
