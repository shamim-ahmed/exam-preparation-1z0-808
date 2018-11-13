package edu.buet.cse.oca.q10;

public interface AdvancedVenicle extends Vehicle {
  @Override
  default String getDescription() {
    return Vehicle.super.getDescription(); // invoking the default method in super interface
  }
}
