package edu.buet.cse.oca.q6;

public class Trial {
  public static void main(String... args) {
    Moveable m = new Donkey();
    m.move(20);
    m.moveBack(5);
    System.out.println(m.position);
  }
}
