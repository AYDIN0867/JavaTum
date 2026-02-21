package TEKRAR.Konu.Konu33_ConstructorCall;

public class C02_ConstructorCall {

String isim="Ali";
int sayi=40;

C02_ConstructorCall(){
    System.out.println("parametresiz constructor calisti...");
    C02_ConstructorCall();
    //eğer isim yazıyorsa constructor olamaz..
}

C02_ConstructorCall(int sayi){
    this();
    System.out.println("int parametreli constructor calisti");
    this.sayi=sayi;
}

C02_ConstructorCall(String isim){
    System.out.println("string constructor calisti");
    this.C02_ConstructorCall();
    this.isim=isim;
    sayi=20;
}


    public static void main(String[] args) {

C02_ConstructorCall obj1=new C02_ConstructorCall();//new keyword ile
        //parametresiz constructor çalışacaktır...
C02_ConstructorCall obj2=new C02_ConstructorCall(3);
        System.out.println(obj2.isim);
        System.out.println(obj2.sayi);
    }

void  C02_ConstructorCall(){System.out.println("parametresiz metod calisti...");
}

}
