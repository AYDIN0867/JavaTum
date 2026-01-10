package TEKRAR.Konu32_ParametreliConstructor;

public class C05_Okul {

String ogrIsim="isim atanmamis";
String ogrAdres="adres atanmamis";
String ogrTel="tel atanmamis";
String ogrSube="sube atanmamis";

public double notOrtalması(double not1, double not2){

    return (not1+not2)/2;

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

   C05_Okul(){
    //bu constructor default constructor değildir
       //ama bu haliyle default constructor ile aynı
       //işleve sahiptir...
       //defaul constrctor parametresizdir ve body sinde cod yoktur

       //biz gorunur constructor oluşturdugumuzda java var olan
       //default constructor ı sildiğinden default constructor
       //kullanmış olan objeler sorun yaşamasın diye bu constructor u oluşturduk
       //bir nevi defaultu gorunur yaptım çünkü defaul constructor ile oluşturulan objeler hata vermesin diye

   }

    C05_Okul(String isim,String adres,String telefon){

    ogrIsim=isim;
    ogrAdres=adres;
    ogrTel=telefon;
    }

}
