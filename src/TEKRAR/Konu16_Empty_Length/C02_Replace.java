package TEKRAR.Konu16_Empty_Length;

import java.util.Scanner;

public class C02_Replace {
    public static void main(String[] args) {

        String cumle="java ogrenmek cok guzel";

        // metni "a"  yerin "A" olacak sekilde yazdırın

        System.out.println(cumle.replace('a', 'A')); //JAvA ogrenmek cok guzel

        // metni "e" yerine "E" olacak sekilde yazdırın

        System.out.println(cumle.replace('e', 'E'));

        // "ogrenmek" kelimesine  "bilmek" olarak degistirin

        System.out.println(cumle.replace("ogrenmek", "bilmek"));//Java bilmek cok guzel
        // tum boslukları silip, metni bosluk olmadan yazdırın

        System.out.println(cumle.replace(" ", ""));//Javaogrenmekcokguzel

        //kullanıcıdan cumledeki degistirmek istedigi kısmı
        // ve yerine koymak istedigi metni alın
        //cumleyi yeni hali ile yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz...");
        String metin=scanner.nextLine();
        System.out.println("metin in yerine gelecek yeni metni yazınız...");
        String yeniMetin=scanner.nextLine();

        System.out.println(cumle.replace(metin, yeniMetin));


    }
}
