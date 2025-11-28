package TEKRAR.NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*

        Kullanıcıdan satir ve sütun sayisini alip asagidaki sekli cizdirin...
        orn satir=4, sütun=5 oldugunda

        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
        5 6 7 8 9

         */

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=5 ; j++) {

                System.out.print(i+j+" ");

            }


            System.out.println(" ");
        }







    }
}
