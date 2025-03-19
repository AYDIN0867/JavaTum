package ders21_Method_OverLooding;

public class C02_Overloading {
    public static void main(String[] args) {


topla(3,5);// topla 3 int 5 int topla int int signutaresi olan çalışır
 topla(3.4,2.3); //topla double double  signutare sahip method çalışır
 topla(2.4,5);//topla double int signutaresine sahip bulamaadığında autowidening yapar
        // yani iki doublenin toplamı methodnınu kullanır
 topla('a',6);//signutare: topla char int , matematiksel işlemlerde char da variablenin
        // ascı tablodaki degerine bakılır bu yüzden topla int int methodunu kullanır iki intin toplamı sonucunu verir//103

    }



    public static void topla(int a,int b){//topla int int

        System.out.println("iki int in tolamı :"+(a+b));
    }



    public static void topla(double a,double b){//topla double double

        System.out.println("iki int in tolamı :"+(a+b)); //bu class da over loading var
    }



}
