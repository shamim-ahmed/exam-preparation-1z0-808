package edu.buet.cse.oca.q69;

interface Vehicle {
  static void print() {
    System.out.println("Vehicle");
  }
}

class Car implements Vehicle {
  static double getPrice() {
    return 100_000.0D;
  }
}

public class InterfaceTrial {
  public static void main(String... args) {
    Car c = null;
    // c.print();
    System.out.println(c.getPrice());
    Vehicle.print();
  }
}
