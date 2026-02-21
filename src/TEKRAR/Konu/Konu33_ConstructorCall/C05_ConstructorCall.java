package TEKRAR.Konu.Konu33_ConstructorCall;

public class C05_ConstructorCall {

String isim ="John Doe";
int yas=40;


public C05_ConstructorCall(){

    isim="Seher";
    System.out.println("isim :"+isim);
}

public  C05_ConstructorCall(String isim){
    this();
    this.yas=30;
    System.out.println("isim :" + isim);

}

public C05_ConstructorCall(String isim, int yas ){

    this("Murat");
    this.yas=45;


}

    public static void main(String[] args) {

    C05_ConstructorCall obj1=new C05_ConstructorCall("Esra");
    C05_ConstructorCall obj2=new C05_ConstructorCall("Fatih",35);





    }


}
