package TEKRAR.Konu.Konu44_ClassUyelerininKullanımı;

public class C02_Child extends C01_Parent {

    String str="Child class";
    String t ="Hamza";
    String k="Ahmet";



    public void method2(){System.out.println("Child method2");}
    public void method4(){System.out.println("Child method4");}


    public static void main(String[] args) {

        C02_Child obj=new C02_Child();
        obj.method1();

    }

    public void method1(){

        String str="Child class metod ";
        String t ="Cansu";
        String z="Oguzhan";


        //normlade main metod static dolayısıyla main metodddan burada instance oluşaturlan
        // str a ulalamayız obje üzerinden ulaşırız...
        //static apmak çok tercih edilemez inheritance de kullanılmaz


        System.out.println(s);// Anıl, içinde bulunan scope bakılır
        //burada s yok şimdi class levele bakar class levelde s yok
        //şimdi parnte bakar ve Anıl yazdırır

        System.out.println(this.s);//Anıl önce class da bakar
        System.out.println(super.s);//direk parente bakar...Anıl
        //içinde bulunan class a değil doğrudan parent a bakar

        System.out.println(str); // Child class metod ,önce içinde bulunan scopa bak
        //ve bu scopda str var yazdırılınca child class metod yazmalıdır

        System.out.println(this.str);//child class yani class seviyesindeki getirdi

        System.out.println(super.str);//buda parent class daki str ı getirir
        //Calismak isitir...

        System.out.println(t);//Cansu
        System.out.println(this.t);//Hamza
        //System.out.println(super.t);//parent class a bakarız orda t yok
        //burdan geri vites yani child a bakayım DİYEMEYIZ
        //BULAMADIGI İÖÇİNDE HATA VERİR cte ...

        System.out.println(z);//içinde bulundugumuz scopede ki z //oguzhan
       // System.out.println(this.z);//class seviyesinde z //Ahmet
       // System.out.println(super.z);//p<rent da z yok CTE verir

        System.out.println(k);//scopa gider
        System.out.println(this.k);//class a gider
       // System.out.println(super.k); //parente bakar orda yok cte verir


        method2();//içinde bulundugumuz metod static olmadıgından içeri girmek de sorun yok
        //class da varsa bunu kullnaır
        super.method2();//buda doğrudan parent class daki metod2 tye gider
        this.method2();//bu class da metod2 yi ara bul kullan

        method3();//içinde bulunan class bakılır
        //yoksa parent a bakar parent method3 çalışır
        super.method3();//aramaya parent dan başlar ve parentdaki metod3 u calıştırır








    }


}
