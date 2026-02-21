package TEKRAR.Konu.Konu32_ParametreliConstructor;

public class C04_CarRunnerToString {

    public static void main(String[] args) {

 // C03_Car class'inda bir obje olusturup tum özelliklerini yazdirin...

 C03_Car car1=new C03_Car();

        System.out.println(car1.marka); //marka atanmamis
        System.out.println(car1.toString());

        //C03_Car{marka='marka atanmamis', model='model atanmamis', renk='model atanmamis', yil=1900, fiyat=0}
        System.out.println(car1);
       //C03_Car{marka='marka atanmamis', model='model atanmamis', renk='model atanmamis', yil=1900, fiyat=0}

//oluşturdugumuz objeye kendi istediğimiz dgerleri atayalım

        car1.renk="siyah";
        car1.yil=2014;
        car1.fiyat=10000;
        car1.marka="Audi";

        System.out.println(car1);

        // yeni bir obje oluşturalım




    }

}
