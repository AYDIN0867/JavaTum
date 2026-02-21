package TEKRAR.Konu.Konu14_SubString;

public class C01_Substring_TekParca {
    public static void main(String[] args) {


        String str= "Az ye az uyu az konuş hayrete var";

        System.out.println(str.length());//33

        //12. karatreini yazdırın

        System.out.println(str.charAt(11));//u

       // 10. karakterden baslayıp, sona kadar butun metni yazıdırın...

        System.out.println(str.substring(10,str.length()-1)); //yu az konuş hayrete va
        System.out.println(str.substring(10)); //yu az konuş hayrete var

      // ilk kelime haric geriye kalan metni yazdırın "ye az uyu az konuş hayrete var"

        System.out.println(str.substring(3)); //ye az uyu az konuş hayrete var

     // ilk harf haric, kalan metni yazdirin...

        System.out.println(str.substring(1));//z ye az uyu az konuş hayrete var

    // sondan 5.karakterini yazdirin...

        System.out.println(str.charAt(str.length()-5)); //e

   // son 5 karakterini yazdırn

        System.out.println(str.substring((str.length()-5)));//e var
// charAt() ve substring() method'lari farkli sonuclar verebilir
// lenght 30 , son harfin index i 29

// son karakteri charAt ile yazdirin

        System.out.println(str.charAt(str.length()-1));//r

// son karakteri substring () ile yazdirin

        System.out.println(str.substring(str.length()-1)); //r

// index olarak str.lenght () i, kullanarak
// charAt() ve substring 'i kullanalım




    }
}
