package edu.buet.cse.oca;

public class PresidentialPalace implements DuplexHouse {
  public static void main(String... args) {
    House house = new PresidentialPalace();
    System.out.println(house.getDescription());
  }
}
