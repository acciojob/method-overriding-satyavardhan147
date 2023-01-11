package com.driver;
import java.io.*;
import java.util.*;

class A
{
   public String meth()
   {
     return "Invoking method from class A";
   }
}

class B extends A
{    
    @Override
    public String meth()
    {
       return "Method is overridden in Extendend class B";
    }

}
public class Main {
  B bObj = new B();
  bObj.meth();
  bObj.meth();
}
