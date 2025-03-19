package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C08_AutoRunner {

    public static void main(String[] args) {

      C07_Auto oto1=new C07_Auto();
        System.out.println(oto1);
        //C07_Auto{marka='Marka atanmamis',
        // model='Model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0}

C07_Auto oto2=new C07_Auto("mercedes","e200");
        System.out.println(oto2);
        //C07_Auto{marka='mercedes',
        // model='e200', renk='Renk atanmamis', yil=1900, fiyat=0}

   C07_Auto oto3=new C07_Auto("bmw","520",2010);
        System.out.println(oto3);
        //C07_Auto{marka='bmw', model='520', renk='Renk atanmamis', yil=2010, fiyat=0}

C07_Auto oto4=new C07_Auto("nissan","mikra","beyaz",2015,7000);
        System.out.println(oto4);
//C07_Auto{marka='nissan', model='mikra', renk='beyaz', yil=2015, fiyat=7000}

        C07_Auto oto5=new C07_Auto("Tofas","sahin","kahverengi",2012,8000);
        System.out.println(oto5);
//C07_Auto{marka='Tofas', model='sahin', renk='kahverengi', yil=2012, fiyat=8000}
    }
}
