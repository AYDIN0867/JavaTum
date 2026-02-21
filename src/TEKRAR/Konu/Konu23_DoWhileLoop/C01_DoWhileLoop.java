package TEKRAR.Konu.Konu23_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {


//önce yap sonra bak hiçbir şarta bakmaksızın bir defa yapar...
//çıkış kontrol dongusu denir...
// do while loop bodys en az birdefa kullanılır
//tekrar sayısı belli değilse ve dongu en az birdefa çalışması gereekiyorsa bunu kullnaıırız...


//1 den 5 e kadar (5 haric) olan sayıları yazıdırın

int sayi=1;
while (sayi<5){

    System.out.print(sayi+ " ");
    sayi++;

}

        System.out.println("");

//aynısını do while ile yapaılım

        sayi=1;

        do {
            System.out.println(sayi+ " ");
            sayi++;
        }while (sayi<5);

        //do-while da condition kontrol sayısı ile loop body çalışma sayısı aynıdır...



    }
}
