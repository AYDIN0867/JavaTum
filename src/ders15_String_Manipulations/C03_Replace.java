package ders15_String_Manipulations;

import java.util.Scanner;

public class C03_Replace {

    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        // metni "a" yerine "   "A" olacak şekilde yazdırın
        System.out.println(str.replace("a", "A"));

        // metni 'e' yerin 'E' olacak sekilde yazdirin

        System.out.println(str.replace('e', 'E'));


        // "ogrenmek" kelimesine "bilmek" olarak degistirin
        System.out.println(str.replace("ogrenmek", "bilmek"));

        // tum boslukları silip, metni bosluk olmadan yazdırın
        System.out.println(str.replace(" ", ""));

// kullanicidan cümledeki değiştirmek istediği kısmı
        //ve yerine koymak istediği metni alın
        //cümleyi yeni haliyle yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("cümledeki değiştirmek istediğiniz kısmı yazınız");
        String eskiMetin=scanner.nextLine();
        System.out.println("yerine yazdırmak istediğiniz metni yazınız");
        String yeniMetin=scanner.nextLine();

        System.out.println(str.replace(eskiMetin,yeniMetin));




    }
}
