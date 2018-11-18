package edu.buet.cse.oca.q65;

public interface FourWheeler extends Vehicle {
  int NO_OF_WHEELS = 4;

  @Override
  default String getDescription() {
    return "4 Wheeler";
  }
}
