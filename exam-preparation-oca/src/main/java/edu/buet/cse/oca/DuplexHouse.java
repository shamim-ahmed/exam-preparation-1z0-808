package edu.buet.cse.oca;

public interface DuplexHouse extends House {
  @Override
  default String getDescription() {
    return "A Duplex House";
  }
}
