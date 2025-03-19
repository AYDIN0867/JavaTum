package ders50_MultipleUnchekedException;

public class C04_TekTryMultipleCatch {
    public static void main(String[] args) {

        String str="Sefkat candir";
        int [] arr={1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};
        //verilen negatif olmayan bir tamsayiyi index olarak kabul edip
        //yukarıdaki str ve arr deki o index de bulunan harfi ve sayiyi yazdırın
        //eger kullanici indexten büyük sayi girerse
        //hata mesaji ve son index i yazdirin

        int indeks=112;

        if (indeks<0){

            System.out.println("indeks sıfırdan küçük olamalıdır");
        }else {

            //2. yöntem: tek try  multiple catch

           try {
               System.out.println(arr[indeks]);
               System.out.println(str.charAt(indeks));

           }catch (ArrayIndexOutOfBoundsException e){

               System.out.println("girilen indeks arrayin sinirlari disinda.Array için kullanilabilecek son index :"+ (arr.length-1));

           }catch (StringIndexOutOfBoundsException e){

               System.out.println("girilen indeks strindin sinirlari disinda.Kullanilabilecek son index :"+ (str.length()-1));

           }

/*
C03_MultipleTryCatch classindaki ayrı ayrı tary catch yöntemi ile bu class daa kullanılan
tek try multiple catch arasında hata vermeden kodun calışması anlamında birfark yok
 fakat kodun ayıklanması anlamaında ilk kullnaılan yöntem hata ayıklama anlamaında daha iyi

 */







        }//else sonu



    }
}
