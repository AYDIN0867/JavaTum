package ders48_Interface;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public interface M01_ParentInterface {

    void method1();
    void method2();
    void method3();
    String method4();

    int method5();


    public default void method6(){System.out.println("default method calisti");}
    public static void method7(){System.out.println("static method calisti");}

    List<String> liste=new ArrayList<>();


}
