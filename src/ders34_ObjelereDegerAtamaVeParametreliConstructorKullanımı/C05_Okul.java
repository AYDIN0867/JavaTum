package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C05_Okul {

    String ogrIsim="isim atanmadı";
    String ogrAdres="Adres atanmadı";
    String ogrTel="tel atanmadı";
    String ogrSube="sube atanmadı";


    public double notOrtalamsi(double not1,double not2){

        return (not1+not2)/2;
    }

    C05_Okul(){}
    // bu constructor default constructor değildir ama aynı işleve sahiptir

   C05_Okul(String isim,String adres,String tel){

        ogrIsim=isim;
        ogrAdres=adres;
        ogrTel=tel;
   }

C05_Okul(String isim,String adres,String tel,String sube){

        ogrIsim=isim;
        ogrAdres=adres;
        ogrTel=tel;
        ogrSube=sube;
}






    @Override
    public String toString() {
        return "C05_Okul{" +
                "ogrIsim='" + ogrIsim + '\'' +
                ", ogrAdres='" + ogrAdres + '\'' +
                ", ogrTel='" + ogrTel + '\'' +
                ", ogrSube='" + ogrSube + '\'' +
                '}';
    }
}
