package TEKRAR.Konu.Konu43_ConstructorCall;

public class C04_GP {

    C04_GP(){

        System.out.println("parametresiz constructor calıştı");

    }

    C04_GP(String s){
        this(4);
        System.out.println("gp parametreli constructore calisti");
    }

    C04_GP(int a){

        System.out.println("GP int parametreli constructor calisti");

    }


}
