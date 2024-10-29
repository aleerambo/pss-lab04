package it.unibo.animal;

public class Squirrel implements Animal{
    private final double averageWeight;
    private final boolean canEatVegetables;

    public Squirrel(){
        this.averageWeight = 0.5;
        this.canEatVegetables = true;
    }

    public double averageWeight() {
        return this.averageWeight;
    }

    public boolean canEatVegetables() {
        return this.canEatVegetables;
    }

    public boolean canEat(Animal a) {
        return a.averageWeight() < this.averageWeight;
    }
}
