package edu.buet.cse.oca.q5;

public class ExceptionTrial {
  public static void main(String...args) throws Exception {
    try {
      m1();
    } catch (Exception ex) {
      ex = null;
      throw ex;
    }
  }
  
  static final void m1() throws Exception {
    throw new Exception();
  }
}
