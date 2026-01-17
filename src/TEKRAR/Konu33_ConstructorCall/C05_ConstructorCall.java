package TEKRAR.Konu33_ConstructorCall;

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

    this.yas=45;


}



}
