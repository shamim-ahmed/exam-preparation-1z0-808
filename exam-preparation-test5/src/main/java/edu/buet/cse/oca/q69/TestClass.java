package edu.buet.cse.oca.q69;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestClass {
  public static void main(String... args) {
    // why are these two calls different ?
    foo(null);

    Object obj = null;
    foo(obj);
  }

  static void foo(Object obj) {
    System.out.println("Object version");
  }

  static void foo(IOException ex) {
    System.out.println("IOException version");
  }

  static void foo(FileNotFoundException ex) {
    System.out.println("FileNotFoundException version");
  }
}
