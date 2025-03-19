package ders43_encapsulation;

public class C04_encapsuleRunner {

    public static void main(String[] args) {

       C03_EncapsuleRapor obj=new C03_EncapsuleRapor();

       // satistutarı variablesinin degerini yazdırın
       //her ne kadar obje ulaştırmış olsak ve
        // bu objeler üzerinden static olsa dahi yine de ulaşamayız

       // System.out.println(obj.setSatisTutari(100));

        //void method ile yazdırma yapamayız ama deger atayabiliriz

        obj.setSatisTutari(100);
        obj.setSatisTutari(400);
        obj.setSatisTutari(500);
        //burda deger atadık ama bunları yazdırmak istedğimizde hata verir çünkü
        //setSatis methodu void bir method dolayısıyla write yaptık ama read olmasınıda
        // bu şekilde önleddik


        //toplam satış tutarını yazdırn

        System.out.println(obj.getToplamSatisTutari());//1000
        //burda sonucun 1000 çıkması üst satırda verdiğimiz degerlerin toplamı 1000
        //17,18,19. satırlarda degerleri verdik ama sonucu yazdıramadık ki zaten göre böyle idi
        //burda ise getter methodu kullanarak sonucu yazdırdık

        //toplam satış tutarını değiştirin

        //obj.getToplamSatisTutari()=800;
        //eşitliğin sol tarafında variable olmasını ister am
        // aburada method bize deger döndürdü yani getter methodu ile deger ataması yapamayız




    }
}
