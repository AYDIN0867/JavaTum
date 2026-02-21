package TEKRAR.Konu.Konu15_StartsWith;

public class C01_StartsWith {
    public static void main(String[] args) {

      String str="başlamak bitirmektir bilene";

      //str "başlamak" ile mi başlıyor

        System.out.println(str.startsWith("başlamak")); //true

      // str "b" ile mi başlıyor

        System.out.println(str.startsWith("b")); // true

      // str "ba" ile mi başlıyor

        System.out.println(str.startsWith("ba")); // true

      // str "basla" ile mi başlıyor

        System.out.println(str.startsWith("başla")); //true

      // str " B " ile mi baslıyor

        System.out.println(str.startsWith("B")); //false

      // str "başlamak bitirmek" ile mi başlıyor

        System.out.println(str.startsWith("başlamak bitirmek"));

        System.out.println(str.strip()); //başlamak bitirmektir bilene

     // str 5 index ve sonrası "ak" ile mi başlıyor

        System.out.println(str.startsWith("mak", 5));//true

    // str 9 index ve sonrası "b" ile mi başlıyor

        System.out.println(str.startsWith("b", 9));//true


    }
}
