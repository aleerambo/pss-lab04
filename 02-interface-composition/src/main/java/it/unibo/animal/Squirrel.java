package it.unibo.animal;

import it.unibo.diet.*;

public class Squirrel implements Animal{
    private final Diet diet;

    public Squirrel(){
        diet = new Herbivore();
    }

    public double averageWeight() {
        return 0.5;
    }

    public boolean canEatVegetables() {
        return this.diet.isHerbivore();
    }

    public boolean canEat(Animal a) {
        return this.diet.isCarnivore() && (a.averageWeight() < this.averageWeight());
    }
}
