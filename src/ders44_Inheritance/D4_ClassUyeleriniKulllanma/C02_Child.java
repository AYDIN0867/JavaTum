package ders44_Inheritance.D4_ClassUyeleriniKulllanma;

public class C02_Child extends C01_Parent {

    String str="Child class";
    String t="Hamza";
    String k="Ahmet";

    public void method2(){ System.out.println("Child method2");}
    public void method4(){ System.out.println("Child method4");}

    public static void main(String[] args) {

        C02_Child obj =new C02_Child();

        obj.method1();

    }


    public void method1(){

        String str="child class method str";
        String t="Cansu";
        String z="Oguzhan";


        System.out.println(s);//Anil önce içinde bulunduğumuz scope de s aradık sonra
        // class levele baktık
        // bulamadık ve parente gittik

        System.out.println(this.s);//anil
        System.out.println(super.s);//içinde bulunduğu scope ve class a bakmaz üçü içinde aynı olabşlir
        //çünkü sadece dede  var parentta yani



        System.out.println(str);//"child class method str"
        // hangi str ı yazdı tabiki içinde bulunduğumuz scopeden aldı...

        //ama class leveldeki str kullanamk isitiyorum bu class da ise str
        System.out.println(this.str);//Child class clas levledeki str yazar
        System.out.println(super.str);//Java candir parent a gider

        System.out.println(t);//cansu
        System.out.println(this.t);//class levele bakar ve //hamza yazdırır
        //System.out.println(super.t);//class levele bakar ve //hamza yazdırır
        //super parentte aratır ve parentte olmadığı için CTE verir.

        System.out.println(z);//oguzhan
        //System.out.println(this.z); hem class da hem
        // deparentte olmadığı için CTE VERİR

        System.out.println(k);//class levldekı k yı yani Ahmeti yazdırır
        System.out.println(this.k);//scope bakmaz class levele bakar //ahmet yazar
        //System.out.println(super.k); hata veriyor çünkü parentte z  yok super direk parente gönderir

        method2(); //Child method2
        super.method2();//Parent method2
        this.method2();//Child method2 yazar

        method3();//"Parent method3"
        super.method3();//"Parent method3"
        this.method3();//"Parent method3"


        method4();//Child method4"
        //super.method4();parentte yokCTE verir
        this.method4();//Child method4




    }


}
