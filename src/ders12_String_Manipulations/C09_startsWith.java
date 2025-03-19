package ders12_String_Manipulations;

public class C09_startsWith {

    public static void main(String[] args) {

        String str="Java gün gectikce guzelesiyor";

        System.out.println(str.startsWith("Jav"));// jav üç harf metnimizin
        // ilk üç harfi Jav mı diye bakar eger str işk üç harfi equals "Jav " ise true yazar

        System.out.println(str.startsWith("J")); // BUDA TRUE ÇIKACAKTIR
        System.out.println(str.startsWith("java")); // false çıkar çünkü ilk dört harfi küçük harflerle java değil


        System.out.println(str.contains("Java"));// true

        System.out.println(str.equals("Java"));//false

        System.out.println(str.startsWith("Java"));// true

        System.out.println("========================");

        System.out.println(str.startsWith(""));//true
        System.out.println(str.startsWith("Java gün gectikce guzelesiyor"));//true

        str.startsWith("gun",5);//true

        /*
        2 pamatere giridiğimizde 2 .parametrete aramaya nereeden başalayacağını soyler

        yani 27. saatır şu anlama gelir gun gectikce guzellesiyor metni  5.indeksten sonra gun ile mi baslıyor

         */











    }
}
