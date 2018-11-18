package edu.buet.cse.oca.q65;

// An attempt to create the diamond of death problem
public class FuturisticVehicle implements TwoWheeler, FourWheeler {
  // without overriding this method, the class will not compile
  @Override
  public String getDescription() {
    // note the novel syntax of accessing default methods from superinterfaces
    String s1 = TwoWheeler.super.getDescription();
    String s2 = FourWheeler.super.getDescription();

    return s1 + " and " + s2 + " : Futuristic Vehicle";
  }

  public static void main(String... args) {
    FuturisticVehicle vehicle = new FuturisticVehicle();
    System.out.println(vehicle.getDescription());

    // note the cast in the following code
    System.out.println(((TwoWheeler) vehicle).NO_OF_WHEELS);
    System.out.println(((FourWheeler) vehicle).NO_OF_WHEELS);
  }
}
