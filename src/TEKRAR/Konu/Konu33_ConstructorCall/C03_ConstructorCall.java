package TEKRAR.Konu.Konu33_ConstructorCall;

public class C03_ConstructorCall {

int sayi=23;
String isim="Ali";
char chr ='@';

C03_ConstructorCall(){
    chr='%';
    isim="Esra";
}//1

C03_ConstructorCall(int sayi, String ism){
    this();//parametresiz constructor a git demektir...
    this.sayi=34;
    isim=ism.toUpperCase();
}//2

C03_ConstructorCall(int sayi, String name, char a){
    isim=name;
    this.sayi=sayi;

}//3
//this(parametreler) constructor un ilk satırında yazılmalıdır....










    public static void main(String[] args) {

        C03_ConstructorCall obj1=new C03_ConstructorCall();
        System.out.println(obj1.sayi);//23
        System.out.println(obj1.isim);//Esra
        System.out.println(obj1.chr);//%


        C03_ConstructorCall obj2=new C03_ConstructorCall(20,"Kemal");
        System.out.println(obj2.sayi);//34
        System.out.println(obj2.isim);//KEMAL
        System.out.println(obj2.chr);//%

        C03_ConstructorCall obj3=new C03_ConstructorCall(22,"Mehmet",'r');
        System.out.println(obj3.sayi);//23
        System.out.println(obj3.isim);//Esra
        System.out.println(obj3.chr);//%




    }
}
