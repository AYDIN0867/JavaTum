package TEKRAR.Konu.Konu27_MultiDimensionalArrays;

public class C02_TumElemanlarıToplama {
    public static void main(String[] args) {

       // int [][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int [] sayilar={3,6,9,1};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }

        System.out.println(toplam);//19



        int [][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
    //array in tum elementlerini toplamını yazdırın....
        toplam=0;

        for (int i = 0; i <arr.length ; i++) {//outer array i kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {//herbir inner array deki inner elementleri kontrol eder

         toplam+=arr[i][j];

            }



        }

        System.out.println("Tum elementlerin toplamı "+toplam); //Tum elementlerin toplamı 44

    }
}
