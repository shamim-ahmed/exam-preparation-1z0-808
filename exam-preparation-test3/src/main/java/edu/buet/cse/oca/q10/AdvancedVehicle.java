package edu.buet.cse.oca.q10;

public interface AdvancedVehicle extends Vehicle {
  @Override
  default String getDescription() {
    return Vehicle.super.getDescription(); // invoking the default method in super interface
  }
}
