package TEKRAR.Konu.Konu34_StaticKeyWord;

public class C06_Deneme {

    static int sayi=20;
    int yas=40;

    public C06_Deneme(){

        sayi++;
        yas=10;

    }

    public static int metod1(){


        return 2*sayi;
    }

    public static void main(String[] args) {

        C06_Deneme obj1=new C06_Deneme();
        C06_Deneme obj2=new C06_Deneme();

        int sonuc=obj2.metod1();

        System.out.println(obj2.yas+","+obj2.sayi+","+sonuc);


// main metoddan başlanır
// parametresiz constructor ile obje oluşturulmuş
// için e girilemden obj1 oluşturulur
// instance variablenin kopyası alınıp objeye yapıştırılır




    }

}
