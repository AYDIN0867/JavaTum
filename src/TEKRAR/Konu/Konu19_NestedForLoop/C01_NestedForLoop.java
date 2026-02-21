package TEKRAR.Konu.Konu19_NestedForLoop;

public class C01_NestedForLoop {

    public static void main(String[] args) {

//bir for loop kullanarak 1 2 3 4 yazdırın

        for (int i = 1; i <=4; i++) {

            System.out.print(i);
        }

        System.out.println(" ");
//bir for loop kullanarak 2 4 6 8 yazdırın

        for (int i = 2; i <=8 ; i+=2) {

            System.out.print(i);
        }

        System.out.println("");
//bir for loop kullanarak 3 6 9 12 yazdırın

        for (int i = 3; i <=12 ; i+=3) {

            System.out.print(i);

        }

//bir for loop kulanarak aşağıdaki sayıları yazdırın...
/*
    1234
    2468
    36912
    481216
 */

//Outer loop satirlari kontrol eder...
// inner loop sütünları kontrol eder...



        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <= 4; j++) {

                System.out.print(i*j+" ");

            }

            System.out.println("");
        }











    }
}
