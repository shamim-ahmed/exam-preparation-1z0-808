package edu.buet.cse.oca.q67;

public class Lion extends Animal {
  // this field will be used only if it is referred from Lion class or its subclass, and NOT from
  // superclass
  String name = "Lion";

  public static void main(String... args) {
    Animal animal = new Lion();
    animal.print();
    ((Lion) animal).print(); // does the cast make any difference ?

    System.out.println(animal.name);
    System.out.println(((Lion) animal).name); // does the cast make any difference ?
  }
}
