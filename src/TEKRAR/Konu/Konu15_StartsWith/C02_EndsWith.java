package TEKRAR.Konu.Konu15_StartsWith;

public class C02_EndsWith {
    public static void main(String[] args) {

String str = "hayat güzel durmadan yürürsen";

//str "yürürsen" ile mi bitiyor

        System.out.println(str.endsWith("yürürsen"));//true

//   metin "yürürsen" içeriyor mu

        System.out.println(str.contains("yürürsen"));//true

// str "yürürsen" ile mi başlıyor

        System.out.println(str.startsWith("yürürsen"));//false

// str "hayat" mı?

        System.out.println(str.equals("hayat"));//false

// str "sen" ile mi bitiyor

        System.out.println(str.endsWith("sen"));//true



    }
}
