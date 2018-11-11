package edu.buet.cse.oca.q29;

import java.util.Arrays;
import java.util.List;

public class LoopTrial {
  public static void main(String... args) {
    List<String> nameList = Arrays.asList("Apple", "Orange", "Peach");
    
    for (String name : nameList) {
      System.out.println(name);
      name = null;  // name is just a local variable
    }
  }
}
