package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C07_Auto {

    String marka="Marka atanmamis";
    String model="Model atanmamis";
    String renk="Renk atanmamis";
    int yil=1900;
    int fiyat;

//parametre olarak marka ve model degerleri olan bir constructor oluşturun
   C07_Auto(){


   }

    C07_Auto(String mrk, String mdl){
    marka=mrk;
    model=mdl;

 }

//parametre olarak marka,model ve yil degerleri alan bir constructor olusturun

    C07_Auto(String marka,String model,int yil){

      this.marka=marka;
       this.model=model;
       this.yil=yil;
    }

//tum instance variablelere parametre olarak
// kabul eden bir constructor i intelij ile olusturun


    public C07_Auto(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "C07_Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
