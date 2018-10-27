package edu.buet.cse.oca;

public interface House {
  default String getDescription() {
    return "A generic house";
  }
}
