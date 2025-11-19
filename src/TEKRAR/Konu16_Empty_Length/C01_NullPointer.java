package TEKRAR.Konu16_Empty_Length;

public class C01_NullPointer {
    public static void main(String[] args) {


        //değer atamadan variable oluşturmak için üretilmiştir...nullpointer keyWord dur.

        String isim1="";
        String isim2;
        String isim3= null;

        // isim1 ' i yazdırın
        System.out.println(isim1);//yazılan bir şey yok

        // isim1 'in length ini yazdirin
        System.out.println(isim1.length());//0


        // isim2 ' i yazdırın
        //System.out.println(isim2);//atama olmadıgı için hata verir

        // isim2 'in length ini yazdirin
        // System.out.println(isim2.length());//atama olmadıgı için hata verir


        /*
           Bir metod içerisinde (local) deger atamadan variable  deklare edebiliriz,
           ancak deger atamadan kullanmak istersek
          Java altini kirmizi cizer ve kullanmamiza izin vermez (Compile Time Error,CTE)
         */

        // isim3 ' i yazdırın
        System.out.println(isim3);//0
        System.out.println(isim3 + "Java");//nullJava

        // isim3 'in length ini yazdirin
        System.out.println(isim3.length());//NullPointerExcception
        System.out.println(isim3.substring(1));//NullPointerExcception
        System.out.println(isim3.isBlank());//NullPointerExcception

        /*

        null pointer bir deger degil ISARETCIDIR
        her ne kadar = işareti ile kullanılsa da
        Java null'un bir deger degil isaretci oldugunu bilir

        - deger atanmayanlari icin null olarak isaretlenenleri getir diyebiliriz
        - yazdirmak istersek YAZDIRABILIRIZ
        - ANCAK baska hic bir islemde KULLANMAYIZ
        - kullanmaya kalkarsanız jAVA altını cizmez ama calıstırılınca NullPointException verir

         */






    }
}
