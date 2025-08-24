package TEKRAR.Konu02_DataKullanimiveVariables;

public class D02_VariablesDikkatEdilecek {
    public static void main(String[] args) {
   //1-bir variable için bir defa deklerasyon yapılır aynı isimimde deklerasyon yapılamaz

   int say=20;

  // int say=25; //Variable 'say' is already defined in the scope
        // deklerasyonu iki defa yapmaya izin yok

say=30;

say=say+5;

        System.out.println(say);//35

//2-eşitliğin sol tarafında sadece variable olur sagda ise deger

int yas=20;

//2*yas=40; Variable expected
//char sadece 1 karakter alir ve tek tırnak icinde yazilir

short sayi=23;
        System.out.println(sayi);




    }//main sonu






}
