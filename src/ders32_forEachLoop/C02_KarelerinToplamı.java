package ders32_forEachLoop;

public class C02_KarelerinToplamı {

    public static void main(String[] args) {

    //verilen int array deki her elementin karelerini alip,
    //karelerin toplamını yazdıran bir method oluşturun

        int arr[]={1,3,5,7,2,1};

        karelerininToplaminiYazdir(arr);

    }


    public static void karelerininToplaminiYazdir(int []arr){

        int karelerinToplami=0;
        for ( int each
                 :   arr) {

            karelerinToplami+=each*each;
           }
        System.out.println("Arraydeki elementlerin toplamı :"+karelerinToplami);
    }
}
