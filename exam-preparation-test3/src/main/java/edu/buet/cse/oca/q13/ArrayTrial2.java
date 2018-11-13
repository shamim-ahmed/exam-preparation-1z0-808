package edu.buet.cse.oca.q13;

class RedException extends Exception {
  RedException(String msg) {
    super(msg);
  }
}


class GreenException extends Exception {
  GreenException(String msg) {
    super(msg);
  }
}


public class ArrayTrial2 {
  public static void main(String... args) throws Exception {
    int n = getValues()[getIndex()];   // which exception will be thrown ?
    System.out.println(n);
  }

  private static int[] getValues() throws Exception {
    throw new RedException("Red Exception");
  }

  public static int getIndex() throws Exception {
    throw new GreenException("Green Exception");
  }
}
