package edu.buet.cse.oca.q65;

public interface TwoWheeler extends Vehicle {
  int NO_OF_WHEELS = 2;
  
  @Override
  default String getDescription() {
    return "2 Wheeler";
  }
}
