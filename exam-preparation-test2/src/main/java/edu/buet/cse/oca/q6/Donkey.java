package edu.buet.cse.oca.q6;

public class Donkey implements Moveable {
  int position = 10;

  @Override
  public void move(int x) {
    position += x;
  }

  @Override
  public void moveBack(int x) {
    position -= x;
  }
}
