package ders31_ArrayListSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {



       List<String> isimler= isimListeleDondur();
        System.out.println("oluşturulan liste"+isimler);

    }

    private static List<String> isimListeleDondur() {

        List<String> isimler=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenIsım="";
        //kaç defa sorulacağı belli olmadığı için while tercih edilir
        do {
            System.out.println("lütfen listeye eklemek için isim giriniz"+
                    "\n bitirmek için q ya basınız");

            girilenIsım=scanner.nextLine();
            if (!girilenIsım.equalsIgnoreCase("q")){
                isimler.add(girilenIsım);
            }

        }while (!girilenIsım.equalsIgnoreCase("q"));

        return isimler;
    }

//kullanicidan istediği kadar isim alip,
//Q ya bastiğinda giridiği isimleri bize liste olarak döndürecek
//bir method oluşturun..


}
