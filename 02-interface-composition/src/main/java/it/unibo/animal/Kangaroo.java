package it.unibo.animal;

import it.unibo.diet.*;

public class Kangaroo implements Animal {

    private final Diet diet;

    public Kangaroo(){
        diet = new Herbivore();
    }

    public double averageWeight() {
        return 55.0;
    }

    public boolean canEatVegetables() {
        return this.diet.isHerbivore();
    }

    public boolean canEat(Animal a) {
        return this.diet.isCarnivore() && (a.averageWeight() < this.averageWeight());
    }
}
