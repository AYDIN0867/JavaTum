package TEKRAR.Konu30_ForEachLoop;

public class C02_KarelerinToplamı {

    public static void main(String[] args) {

        //verilen int arraydeki her elementin karakterini alıp,
        // karelerinin toplamını yazdıran bir metod olusturun


        int [] arr ={1,3,5,7,2};


karelerininToplamınıYazdır(arr);

    }

    public static void karelerininToplamınıYazdır(int [] arr1){

int karelerinToplamı=0;

for(int each:arr1){

    each*=each;
    karelerinToplamı+=each;

}

        System.out.println("array arr1 deki elementelrin kareleri toplamı "+ karelerinToplamı);

    }
}
