package ders35_ConstructorCall;

public class C03 {

    /*
    KOD OKUMA sorularında dikkat edilmesi gereken EN ÖNEMLİ konu bu soruların sizin bilginizi ve dikkatinizi ölçmek için
    oluşturulmuş olmasıdır...

    Bu sorularda herşey olması gerektiği gibi olmayabilir..

    Kodu biz oluşturduğumuzda yapacağımız adımlardan farklı adimlar atilabilir,
    atamalar olması gerektiği gibi yapilmayabilir


    Bu sorularda yapmamız gereken sey
    kendimizi java nin yerine koymak
    satir satir kodları takip etmek
    ve kod da ne yazılmıkşşsa o işlemi yapmaktır


    CTE vermediği sürece kod için yanlış yazılmış diyemeyiz.
    kod takip ederken compile time veya run time da ortaya çıkacak hataları BULMALIYIZ...
    Konsolde ne göreceğimize göre hata olup olmadığı konusunda karar veririz


     */

    int sayi=23;
    String isim="Ali";
    char chr='@' ;

C03(){

    chr='%';
    isim="Esra";
}

C03(int sayi,String ism){
    this();//parametresiz constructora gönderir
    this.sayi=34;
    isim=ism.toUpperCase();
}

C03(int sayi,String name,char a){
    isim=name;
    this.sayi=sayi;

}

    public static void main(String[] args) {

    C03 obj3=new C03(22,"ramazan",'!');

        System.out.println(obj3.isim);//ramazan
        System.out.println(obj3.sayi);;//22
        System.out.println(obj3.chr);//@


        //C03 obj1=new C03();
       // System.out.println(obj1.sayi);//23
        //System.out.println(obj1.isim);//esra
     //   System.out.println(obj1.chr);//%

        C03 obj2=new C03(20,"kemal");
        System.out.println(obj2.sayi);//34
        System.out.println(obj2.isim);//KEMAL
        System.out.println(obj2.chr);//%

    }

}
