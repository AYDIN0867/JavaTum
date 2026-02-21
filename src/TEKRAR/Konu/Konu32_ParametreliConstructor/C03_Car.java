package TEKRAR.Konu.Konu32_ParametreliConstructor;

public class C03_Car {

    String marka="marka atanmamis";
    String model="model atanmamis";
    String renk="model atanmamis";
    int yil=1900;
    int fiyat;

//    C03_Car(){
//
//        marka="Opel";
//        yil =1990;
//        fiyat=1000;
//    }


    @Override
    public String toString() {
        return "C03_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
