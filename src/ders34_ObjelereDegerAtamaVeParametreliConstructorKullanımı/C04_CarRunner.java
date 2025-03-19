package ders34_ObjelereDegerAtamaVeParametreliConstructorKullanımı;

public class C04_CarRunner {

    public static void main(String[] args) {

        /*


         */
  // C03_Car classindan bir obje oluşturup tum özelliklerini yazdirin

    C03_Car car1=new C03_Car();
        System.out.println(car1.toString());
        //C03_Car{model='Model atanmamis',
        // marka='Marka atanmamis', renk='Renk atanmamis', fiyat=0, yil=1900}

        System.out.println(car1);
        //C03_Car{model='Model atanmamis',
        // marka='Marka atanmamis', renk='Renk atanmamis', fiyat=0, yil=1900}

//oluşturuğunuz objeye kendi istediğiniz degerleri atayın ve tum ozellikleri tekrar yazdırın
        car1.marka="Audi";
        car1.model="A4";
        car1.renk="siyah";
        car1.yil=2014;
        car1.fiyat=10000;

        System.out.println(car1);
        //C03_Car{model='A4', marka='Audi', renk='siyah', fiyat=10000, yil=2014}

        //yeni bir obje oluşturun



    }
}
