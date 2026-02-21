package TEKRAR.Konu.Konu32_ParametreliConstructor;

public class C07_Auto {
    String marka="marka atanmamis";
    String model="model atanmamis";
    String renk="Renk atanmamis";
    int yil=1900;
    int fiyat;


    //parametre olarak marka ve model degerleri alan bir constructor olusturun
    C07_Auto(){}//default constructor ile obje oluşturanların hata almamaı için yazarız bu constructor u
    C07_Auto(String mrk,String mdl){

        marka=mrk;
        model=mdl;

    }
//parametre olarak marka,model ve yıl degerleri olan bir constructor olusturun

    C07_Auto(String marka,String model,int yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }


    //tum instance variableları parametre olarak kanul edilen Constructor i intellij ile oluşturn


    public C07_Auto(int fiyat, String marka, String model, String renk, int yil) {
        this.fiyat = fiyat;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
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
