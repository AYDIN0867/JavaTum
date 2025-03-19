package ders50_MultipleUnchekedException;

public class C03_MultipleTryCatch {
    public static void main(String[] args) {

        String str="Sefkat candir";
        int [] arr={1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};
        //verilen negatif olmayan bir tamsayiyi index olarak kabul edip
        //yukarıdaki str ve arr deki o index de bulunan harfi ve sayiyi yazdırın
        //eger kullanici indexten büyük sayi girerse
        //hata mesaji ve son index i yazdirin

        int indeks=53;

        if (indeks<0){

            System.out.println("indeks sıfırdan küçük olamalıdır");
        }else{

            //1. yöntem: ayri ayri try catch

           try { System.out.println(arr[indeks]);

           }catch (ArrayIndexOutOfBoundsException e){

               System.out.println("girilen indeks arrayin sinirlari disinda.Kullanilabilecek son index :"+ (arr.length-1));
           }

            try {System.out.println(str.charAt(indeks));

            }catch (StringIndexOutOfBoundsException e){

                System.out.println("girilen indeks strindin sinirlari disinda.Kullanilabilecek son index :"+ (str.length()-1));


            }







        }









    }
}
