package edu.buet.cse.oca.inheritance;

public class Subaru implements Car {

  @Override
  public void printModel() {
    System.out.println("Subaru");
  }

  public static void main(String... args) {
    Vehicle v = new Subaru();
    v.printModel();
  }
}
