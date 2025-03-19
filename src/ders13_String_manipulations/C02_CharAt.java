package ders13_String_manipulations;

public class C02_CharAt {

    public static void main(String[] args) {

        String str="Java Güzeldir";
        // str'in ilk harfini yazdirin

        char ilkHarf=str.charAt(0);
        System.out.println(ilkHarf);

        // str'daki bastan 9.harfi yazdirin
        System.out.println(str.charAt(8));


        //son harfi yazdirin
        System.out.println(str.charAt(12)); // r son indeks length in bir eksiğidir



        // sondan 3. harfi yazdirin
        System.out.println(str.charAt(13-3));//d

        // sondan 5.harfi ayazdirin
        System.out.println(str.charAt(13-5));//e

//karaktervsayısından yola çık


    }
}
