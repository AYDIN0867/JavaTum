package ders17_For_loop;

public class C11_Nestedforloop {

    public static void main(String[] args) {

     // for loop kullanarak 1 2 3 4

        for (int i = 0; i <=4 ; i++) {

            System.out.print(1*i+" ");

        }

        System.out.println("");

        // aynı for loopu kullanarak 2 4 6 8



        for (int i = 0; i <=4 ; i++) {

            System.out.print(2*i+" ");

        }

        System.out.println("");


        System.out.println("=============================================================");



    //yukarıdaki 3 loop u ayrı ayrı yazmak yerine aynı loopu 3 kere tekrar çalıştırmak


        for (int i = 1; i <3 ; i++) {

            for (int j = 0; j <= 4; i++) {

                System.out.print(j * i + " ");


            }


        }
    }
}
