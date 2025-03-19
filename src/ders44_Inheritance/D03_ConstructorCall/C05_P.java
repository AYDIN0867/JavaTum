package ders44_Inheritance.D03_ConstructorCall;

public class C05_P extends C04_GP{


    C05_P(){
//super
        System.out.println("Parametresiz constructor calisti");
    }

    C05_P(String s){

        this ();
        System.out.println("P String parametreli constructor calisti ");
    }

    C05_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
        //super("Veli"); //Call to 'super()' must be first statement in constructor body

    }

}
