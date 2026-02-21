package TEKRAR.Konu.Konu34_StaticKeyWord;

public class C08_BuKonuyuAnlamakIcinBuOrnegiAnla {

    static int sayi=20;
    int yas=40;
    static String okul="ITU";


    public C08_BuKonuyuAnlamakIcinBuOrnegiAnla(int a, int b,String c){
        this.sayi=a;
        this.yas=b;
        this.okul=c;

    }

    public static void method1(C08_BuKonuyuAnlamakIcinBuOrnegiAnla dnm){
        System.out.println("sayi :"+ dnm.sayi
                                   +", yas :"+ dnm.yas
                                   +", okul : "+dnm.okul);

    }

    public static void main(String[] args) {

       C08_BuKonuyuAnlamakIcinBuOrnegiAnla obj1=new C08_BuKonuyuAnlamakIcinBuOrnegiAnla(20,30,"Odtu");
       C08_BuKonuyuAnlamakIcinBuOrnegiAnla obj2=new C08_BuKonuyuAnlamakIcinBuOrnegiAnla(15,25,"Marmara");
        method1(obj1);
        method1(obj2);

    }





}
