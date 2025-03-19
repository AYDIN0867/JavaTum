package ders21_Method_OverLooding;

public class C03_OverLoading_Ekonomi {

    public static void main(String[] args) {

     // bir class da ayni isimde birden fazla method
        // olduğunda javanın hangisini kullanacağına karar vermek

       topla(5);
       topla(2.3,3.5); //topla double double ==>5. çalışacak ve 5.8 yazar
       topla(2.4,'b');//topla double char ==>YOK  double int i tercihe der :100.4 olur
        // çalışır


    }

    public static void topla(int sayi){//1

        System.out.println("int sayinin toplamı :"+(sayi+sayi));
    }

    public static void topla(int a,int b){//2

        System.out.println("iki int sayinin toplamı :"+(a+b));
    }

    public static void topla(double c,int d){//3

        System.out.println("iki int sayinin toplamı :"+(c+d));
    }

    public static void topla(float c,int d){//4

        System.out.println("iki int sayinin toplamı :"+(c+d));
    }

    public static void topla(double c,double d){//5

        System.out.println("iki int sayinin toplamı :"+(c+d));
    }





}
