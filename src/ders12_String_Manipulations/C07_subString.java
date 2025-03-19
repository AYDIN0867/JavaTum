package ders12_String_Manipulations;

public class C07_subString {

    public static void main(String[] args) {

        String str="java gerçekten çok guzel";
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(2,7));// va ge

// baştan 6 karakteri yazdırın

        System.out.println(str.substring(0,6));// java g

        System.out.println(str.substring(5,6));//g 'substring()' call can be replaced with 'charAt()'
        System.out.println(str.substring(0,1));//J

        //11. harfi büyükharf olarak yazdırın

        System.out.println(str.substring(10,11).toUpperCase());//K

        /*

        bazen bir tek karakteri alıp o karakteri string manipulayion ile kullanmak isteriz
        char at bize char sonuç getiridiğinden char at metodundan sonra string manipulation
         yapılamayacağı için substring
        iile tek bir harfi almayı tercih edebiliriz
         */

        System.out.println(str.substring(5,5));//
        //ilk index  g den başla de ikinci index g dahil olmayacak der
        //geriye hiçlik kalır ve boş bir satır yazdırır

        //System.out.println(str.substring(8,5));
//The call to 'substring' always fails as an argument is out of bounds
// hatası veriri çünkü sekizden sonra 5 yok

     //   System.out.println(str.substring(10,40)); buda aynı haytayı verir


    }
}
