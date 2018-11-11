package edu.buet.cse.oca.q30;

public class Trial {
  public static void main(String...args) {
    int index = 1;
    
    try {
      getArray()[index = 2]++;
    } catch (Exception ex) {
      // do nothing
    }
    
    System.out.println(index);
  }
  
  private static int[] getArray() {
    return null;
  }
}
