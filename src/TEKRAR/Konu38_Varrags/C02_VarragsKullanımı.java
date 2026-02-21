package TEKRAR.Konu38_Varrags;

public class C02_VarragsKullanımı {


    public static void main(String[] args) {
        //argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayıp
        // bulunan toplam deger ile ilk sayının carpımını yazdıran
        // bir metod olusturun
        // örn. 2,3,4,5 ==>(3+4+5) =24

islem(2,3,4,5,6,7,8,9); //işlem  sonucu :242

    }

    public static void  islem(int ilkSayi, int... geriyeKalan){

    int toplam=0;

    for(int each: geriyeKalan){

        toplam+=each;

    }


        System.out.println("işlem  sonucu :"+ ilkSayi+toplam);


    }
}

