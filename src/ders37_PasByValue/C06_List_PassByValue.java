package ders37_PasByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>(Arrays.asList("cansu","Dilan","Bahadir","Maya"));

        birIsimEkle(isimler);//listeye bie isim eklemdim : [cansu, Dilan, Bahadir, Maya, ali]

        System.out.println("main methodda liste"+isimler);
        //methodda listenin kendisine atama yapılmadığı için değişiklik kabul edilir
//main methodda liste[cansu, Dilan, Bahadir, Maya, ali]


        // verilen bir isim listesini parametre olarak alıp
        //kullanıcıdan bir isim alip listeye ekleyen
        // ve listenin yeni halini yazdiran bir method olusturun


yeniListeOlustur(isimler); // methoddayeni liste oluşturup bie isim eklemdim : [ali]
        System.out.println("main methodda liste"+isimler);
        //methodda isimler listesine atama olduğundan ( isimler=new ArrayList<>();) bu değişiklik kabul edilemez
        //main methodda liste[cansu, Dilan, Bahadir, Maya, ali]








    }

    public static void yeniListeOlustur(List<String>isimler) {

        isimler=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scanner.nextLine();

        isimler.add(isim);

        System.out.println("yeni liste oluşturup bie isim eklemdim : "+isimler);

    }

    public static void birIsimEkle(List<String>isimler) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scanner.nextLine();

        isimler.add(isim);

        System.out.println("listeye bie isim eklemdim : "+isimler);

    }
}
