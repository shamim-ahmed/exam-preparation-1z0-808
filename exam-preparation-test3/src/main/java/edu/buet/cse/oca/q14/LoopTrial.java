package edu.buet.cse.oca.q14;

public class LoopTrial {
  public static void main(String...args) {
    boolean flag = false;
    
    while (flag) {
      System.out.println("Hello World");
    }
    
    // the following does not compile
    /*
    while (false) {
      System.out.println("Hello World");
    }
    */

    for ( ;flag; ) {
      System.out.println("Hello World");
    }
    
    // the following does not compile
    /*
    for ( ;false; ) {
      System.out.println("Hello world");
    }
    */
    
    // however, the following works !
    do {
      System.out.println("Hello World");
    } while (false);
  }
}
