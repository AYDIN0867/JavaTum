package ders15_String_Manipulations;

public class C02_NullPointer {

    public static void main(String[] args) {

//String isim1=null; // isim1  deger atanmamıstır
//String isim2;//isim2 ye de deger atanmamıstır
//String isim3="";// isim3 ün hiçlik de olsa deger atanmıstır

// null pointeren avantajı  örneğin sınıfta kaydedilmemeiş kaç ögrenci veya rezervasyona
// açık koltuk var dediğimizde java pointer null kullanılır

        String isim1="";
        String isim2;
        String isim3=null;

        //isim1 i yazdırın
        System.out.println(isim1);
        // isim1'in length'ini yazdırın
        System.out.println(isim1.length());//0



        //isim2 i yazdırın
        //System.out.println(isim2); degeri atanmadığı için hata verir
        // isim2'nin length 'ini yazdirin
        //System.out.println(isim2.length()); degeri yok ki nasıl lengt i olsun



        //isim3 i yazdırın
        System.out.println(isim3);//null
        // isim2'nin length 'ini yazdirin
        //System.out.println(isim3+"java");//0
       // System.out.println(isim3.substring(1));//
        //System.out.println(isim3.isBlank());




    }
}
