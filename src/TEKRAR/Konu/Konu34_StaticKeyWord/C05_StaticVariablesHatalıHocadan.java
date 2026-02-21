package TEKRAR.Konu.Konu34_StaticKeyWord;

public class C05_StaticVariablesHatalıHocadan {

    static int sayi=20;
    int yas=40;


    public C05_StaticVariablesHatalıHocadan(){

        sayi++;
        yas++;
    }

    public static int metod1 (){

       return sayi;
    }

    public int metod2(){

        return yas;
    }

    public static void main(String[] args) {

        C05_StaticVariablesHatalıHocadan obj1=new C05_StaticVariablesHatalıHocadan();
        C05_StaticVariablesHatalıHocadan obj2=new C05_StaticVariablesHatalıHocadan();
        C05_StaticVariablesHatalıHocadan obj3=new C05_StaticVariablesHatalıHocadan();



        System.out.println(obj3.sayi+","+ obj3.yas);
        System.out.println(obj1.sayi+","+ obj1.yas);

/*

int sayi = 20;

System.out.println(sayi++); // 20 yazdırır, sonra 21 olur
System.out.println(++sayi); // önce 22 olur, 22 yazdırır
23,41
23,41


 */




    }



}
