package ders48_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I01_Interface {

    //full abstraction sağlar

  // public void method1(){}

    /*
    Interface abstract methods cannot have body
     */

 public abstract void method2();
 public void method3();
 abstract int method4();
 String method5();

/*
interface içinde oluşturulurken public,ve abstract keywordlerini
yazasak da yazmasak da java tum methodları public ve abstract
olarak kabul eder.
 */



    List<String> list=new ArrayList<>();












}
