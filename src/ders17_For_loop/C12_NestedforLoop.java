package ders17_For_loop;

import java.util.Scanner;

public class C12_NestedforLoop {


    public static void main(String[] args) {

    //kullanıcıdan satır ve sütün sayısı alıp aşağıdaki şekli oluşturun
        /*
    kullanicidan satir ve sutun sayisi alip
    asagidaki sekli olusturun

    1 2 3 4 5
    2 3 4 5 6
    3 4 5 6 7
 */


//birden fazla satır varsa en ve boy varsa nested loop kullanılır
// burada da 3 adet satır ve 5 adet sayı var her satırda

// eger bizden istenen yazdrıma görevinde satır ve sutun varsa iç içe nested for loop kullanmalıyız

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını girin");
        int satır=scanner.nextInt();
        System.out.println("lütfen sutunnsayısını girin");
        int sutun=scanner.nextInt();




        for (int i = 1; i <=3 ; i++) { //satırları kontrol eder

            for (int j = 1; j <=5 ; j++) {

                System.out.println(i+j-1+" ");




            }
            System.out.println("");
        }









    }
}
