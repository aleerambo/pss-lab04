package it.unibo.animal;

import it.unibo.diet.*;

public class SiameseCat implements Animal {
    private final Diet diet;

    public SiameseCat(){
        diet = new Carnivore();
    }

    public double averageWeight() {
        return 4.0;
    }

    public boolean canEatVegetables() {
        return this.diet.isHerbivore();
    }

    public boolean canEat(Animal a) {
        return this.diet.isCarnivore() && (a.averageWeight() < this.averageWeight());
    }
}
