package TEKRAR.Konu35_PassByValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_DegerReturnEdenMetodlar {
    public static void main(String[] args) {

        // verilen isim ve soyisim kac kelime olursa olsun düzenleyip
        // ilk harfleri buyuk, geriye kalan harfler kucuk olacak sekilde
        // "Isim Soyisim" halinde bize donduren bir metod olusturun


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz...");
        String isim=scanner.nextLine();

        System.out.println("Lütfen soyIsminizi giriniz...");
        String soyİsim=scanner.nextLine();

        System.out.println(ismiDuzenle(isim, soyİsim));


    }

    public static String ismiDuzenle(String isim,String soyİsim){

        isim=isim+" "+soyİsim;

        List<String> isimlerList= Arrays.asList(isim.split(""));
        String yeniIsim="";

        for (int i = 0; i < isimlerList.size(); i++) {

            yeniIsim+=(isimlerList.get(i).substring(0,1).toUpperCase())+
                    isimlerList.get(i).substring(1).toLowerCase();

            if (i<isimlerList.size()-1){
                yeniIsim+=" ";

            }
        }


return yeniIsim;

    }





}
