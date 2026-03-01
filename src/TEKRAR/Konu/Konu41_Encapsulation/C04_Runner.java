package TEKRAR.Konu.Konu41_Encapsulation;

public class C04_Runner {

    public static void main(String[] args) {

        C03_EncapsuleRapor obj=new C03_EncapsuleRapor();
        // satis tutari variable'nin degerini yazdirin...

       //obj.satisTutarı=30;
       //suan private variablelre ulşamayız...
       //static olsa da ulaşılamaz

      //  System.out.println(obj.setSatisTutari(100));
        //Cannot resolve method 'println(void)'

//yazdıramayız ama atama yapabiliriz

obj.setSatisTutari(100);
obj.setSatisTutari(400);
obj.setSatisTutari(250); //ama yazdıramayız...

//toplamsatıs tutarını yazdırn

        System.out.println(obj.getToplamSatisTutari());
//750

//toplam satısTutarını değiştirin

//bj.getToplamSatisTutari()=800;
//eşitliğin solundaki metod bize değer dondurdu
//ama java atama işleminde eşitliğin sol tarafında sadece variable ister

    }



}
