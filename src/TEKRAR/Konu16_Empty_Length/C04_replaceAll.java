package TEKRAR.Konu16_Empty_Length;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str ="Ali okula gitti. 3 saat sonra gelecek";


       // tum t'leri T yapin

        System.out.println(str.replace("t", "T"));
        System.out.println(str.replace('t', 'T'));
        System.out.println(str.replaceAll("t","T"));

        // 3 u yerine 2 yazın


        System.out.println(str.replace("3", "2"));
        System.out.println(str.replace('3', '2'));
        System.out.println(str.replaceAll("3","2"));

/*
replace() metod'u verilen metinde aranan char veya string 'in tum kullanımlarını bulur
ve istenen yeni deger ile degistirir

replaceAll da ayni işlevi  yapabilir,
ama asil kullnım amacı ve farkı regex kullanmasıdır

 */

        str ="Kredi karti numaram 1234 3456 3421 6754";
        // tum sayilari * yapın

        System.out.println(str.replaceAll("\\d", "*"));


        str ="ali mert SAHIN";
        //str i ilk harfi buyuk, kalan tum harfleri * olacak sekilde değiştirin

        System.out.println(str.substring(0,1).replaceFirst("a", "A") + str.substring(1).replaceAll("\\w", "*"));


    }
}
