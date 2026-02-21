package TEKRAR.Konu.Konu38_Varrags;

public class C01_Varrags {
    public static void main(String[] args) {

topla(3,5);//8
topla(3,4,5);//12
        topla(1,2,3,4,5,6);



    }
public static void  topla(int... sayılar){
       //buna varrags diyoruz...
    //java farklı sayıda parametre yazmak verine
    //Array altyapısını kullanan Varrag kullanır...
//varrag bir array oldugunu için array gibi kullanırız...

    int toplam=0;

    for(int each:sayılar){
        toplam+=each;
    }

    System.out.println(sayılar.length);

}

    public static void  topla(int a, int b){

        System.out.println("iki sayının toplamı :" + (a+b));

    }

    public static void  topla(int a, int b, int c ){

        System.out.println("iki sayının toplamı :" + (a+b+c));

    }

}
