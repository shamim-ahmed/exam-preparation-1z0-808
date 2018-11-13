package edu.buet.cse.oca.q11;

public class LandRover implements FourWheeler {

  @Override
  public String getDescription() {
    return "Land Rover";
  }

  public static void main(String... args) {
    Vehicle v = new LandRover();
    System.out.println(v.getDescription());
  }
}
