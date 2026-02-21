package TEKRAR.Konu.Konu32_ParametreliConstructor;

public class C08_AutoRunner {

    public static void main(String[] args) {


        C07_Auto oto1=new C07_Auto();
        System.out.println(oto1);
//C07_Auto{marka='marka atanmamis', model='model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0}

C07_Auto oto2=new C07_Auto("mercedes","e200");
        System.out.println(oto2);
//C07_Auto{marka='mercedes', model='e200', renk='Renk atanmamis', yil=1900, fiyat=0}

        C07_Auto oto3=new C07_Auto("BMW","520",2010);
        System.out.println(oto3);
//C07_Auto{marka='BMW', model='520', renk='Renk atanmamis', yil=2010, fiyat=0}

        C07_Auto oto4=new C07_Auto(7000,"Toyota","Corsa","kırmızı",2010);
        System.out.println(oto4);
//C07_Auto{marka='Toyota', model='Corsa', renk='kırmızı', yil=2010, fiyat=7000}



    }

}
