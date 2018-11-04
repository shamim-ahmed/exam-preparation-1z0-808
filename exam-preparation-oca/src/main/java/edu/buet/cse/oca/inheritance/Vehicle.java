package edu.buet.cse.oca.inheritance;

public interface Vehicle {
  default void printModel() {
    System.out.println("A generic vehicle");
  }
}
