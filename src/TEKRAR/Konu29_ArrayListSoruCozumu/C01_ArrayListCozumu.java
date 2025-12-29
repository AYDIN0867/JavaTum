package TEKRAR.Konu29_ArrayListSoruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class C01_ArrayListCozumu {
    public static void main(String[] args) {

//Kullanıcıdan istedigi kadar isim alıp,
// q ya bastıgında girdigi isimleri bize liste olarak dondurun
// bir metod olusturun....

List<String> adlar=stringListeDondur();
        System.out.println("olusturuln liste :"+ adlar);

    }

    public static List<String>stringListeDondur(){

        List<String> isımler=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenIsım= "";

        do {

            System.out.println("lütfen liseye eklemek icin isim giriniz"+
                    "/nbitirmek icin  Q ya basınız....");
            girilenIsım=scanner.nextLine();

            if (!girilenIsım.equalsIgnoreCase("q"))
            {
                isımler.add(girilenIsım);
            }
        }while (!girilenIsım.equalsIgnoreCase("q"));




        return isımler;
    }


}
