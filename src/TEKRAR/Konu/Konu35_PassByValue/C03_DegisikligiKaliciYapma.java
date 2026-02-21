package TEKRAR.Konu.Konu35_PassByValue;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {
    public static void main(String[] args) {

//verilen bir cümlede iki harf buyuk geriye kalan harfleri
// kucuk yapıp sonunda. yoksa nokta koyup bize donduren bi metod olusturun


//kullanıcıdan bir cumle alıp
// metod ile duzenleyin ve yeni halini kaydedin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz....");
        String cumle = scanner.nextLine();
        cumle = cumleyiDuzenle(cumle);
        System.out.println("main metodda cumlenin yeni hali " + cumle);


    }


    public static String cumleyiDuzenle(String cumle) {

        cumle = cumle.substring(0, 1).toUpperCase() +
                cumle.substring(1).toLowerCase();

        if (cumle.charAt(cumle.length() - 1) != '.') {
            cumle += ".";

        }

        return cumle;

    }


}
