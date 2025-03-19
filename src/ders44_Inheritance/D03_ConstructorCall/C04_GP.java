package ders44_Inheritance.D03_ConstructorCall;

public class C04_GP {

    C04_GP(){

        System.out.println("gp parametresiz constructor calisti");
    }

    C04_GP(String s){

        this(4);

        System.out.println("gp string parametreli constructor calisti");
    }

    C04_GP(int a){

        System.out.println("GP int parametreli constructor calisti");
    }

}
