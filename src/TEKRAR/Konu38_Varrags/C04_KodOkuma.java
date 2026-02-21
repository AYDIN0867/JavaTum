package TEKRAR.Konu38_Varrags;

public class C04_KodOkuma {
    public static void main(String[] args) {

   elemanYazdir("Ali",1,2,3,4);
   elemanYazdir("Kerim",3,5,7,8,9,0,2,4);
   islem(2,3,4,5,7,8,9);
    }


    public static void elemanYazdir(String s , int ... v){

        System.out.println(v[s.length()-1]);

    }

    public static void islem(int sayi1, int sayi2, int ...sayilar){

        System.out.println(sayilar[sayi1]+sayilar[sayi2]);//15

    }

}
