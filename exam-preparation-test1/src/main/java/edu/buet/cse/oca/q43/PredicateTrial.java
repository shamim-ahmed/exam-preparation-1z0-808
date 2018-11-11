package edu.buet.cse.oca.q43;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTrial {
  public static void main(String... args) {
    boolean b1 = checkList(new ArrayList(), a1 -> a1.isEmpty());
    boolean b2 = checkList(new ArrayList(), a1 -> a1.add("apple"));

    System.out.println(b1 + " " + b2);
    
    //boolean b3 = checkList(new ArrayList(), (ArrayList a1) -> a1.isEmpty());
  }

  private static boolean checkList(List myList, Predicate<List> p) {
    return p.test(myList);
  }
}
