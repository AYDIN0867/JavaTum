package ders50_MultipleUnchekedException;

public class C05_DahakapsamlıTekTryCatch {
    public static void main(String[] args) {

        String str = "Sefkat candir";
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 2, 3, 4, 5, 6, 7, 5, 4, 3, 4, 5, 7, 6, 5, 9};
        //verilen negatif olmayan bir tamsayiyi index olarak kabul edip
        //yukarıdaki str ve arr deki o index de bulunan harfi ve sayiyi yazdırın
        //eger kullanici indexten büyük sayi girerse
        //hata mesaji ve son index i yazdirin

        int indeks = 16;

        if (indeks < 0) {

            System.out.println("indeks sıfırdan küçük olamalıdır");
        } else {

            //2. yöntem: tek try  multiple catch

            try {
                System.out.println(arr[indeks]);
                System.out.println(str.charAt(indeks));

            } catch (RuntimeException e) {

                System.out.println("indeks sinirlarin disinda.Array için Kullanilabilecek son index :" + (arr.length - 1) +
                        " \nString için kullanılabiliecek son indeks : " + (str.length() - 1));

            }


        }
    }
}
