package it.unibo.animal;

public interface Animal {
    double averageWeight();
    boolean canEatVegetables();
    boolean canEat(Animal a);
}
