package TEKRAR.Konu32_ParametreliConstructor;

public class C04_CarRunnerToString {

    public static void main(String[] args) {

 // C03_Car class'inda bir obje olusturup tum özelliklerini yazdirin...

 C03_Car car1=new C03_Car();

        System.out.println(car1.marka); //marka atanmamis
        System.out.println(car1.toString());

        //C03_Car{marka='marka atanmamis', model='model atanmamis', renk='model atanmamis', yil=1900, fiyat=0}
        System.out.println(car1);
       //C03_Car{marka='marka atanmamis', model='model atanmamis', renk='model atanmamis', yil=1900, fiyat=0}






    }

}
