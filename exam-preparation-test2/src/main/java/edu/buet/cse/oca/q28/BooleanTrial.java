package edu.buet.cse.oca.q28;

public class BooleanTrial {
  public static void main(String... args) {
    boolean b1 = Boolean.parseBoolean("TrUe");
    System.out.println(b1);

    boolean b2 = Boolean.valueOf("FAlSe").booleanValue();
    System.out.println(b2);
    
    Boolean b3 = new Boolean("true");
    Boolean b4 = new Boolean(true);
    
    System.out.println(b3 == b4);
    System.out.println(b3.equals(b4));
    
    Boolean b5 = new Boolean(null);
    System.out.println(b5);
  }
}
