package TEKRAR.Konu33_ConstructorCall;

public class C04_ConstructorCall {

String isim="John Doe";
int yas=40;

public C04_ConstructorCall(){

    isim="Seher";
}

public C04_ConstructorCall(String isim, int yas){
    this();
    this.yas=yas;
}



    public static void main(String[] args) {

  C04_ConstructorCall obj1=new C04_ConstructorCall();

  C04_ConstructorCall obj2=new C04_ConstructorCall("Fatih",35);

        System.out.println("isim :" + obj1.isim+ "yas :" + obj2.yas);







    }
}
