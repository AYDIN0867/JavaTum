package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C03_Car {

    String marka="Marka atanmamis";
    String model="Model atanmamis";
    String renk="Renk atanmamis";
    int yil=1900;
    int fiyat;

    //C03_Car(){

    //    marka="opel";
     //   yil=1990;
     //   fiyat=1000;

   // }


    @Override
    public String toString() {
        return "C03_Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", fiyat=" + fiyat +
                ", yil=" + yil +
                '}';
    }
}
