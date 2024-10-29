package it.unibo;

public class Kangaroo implements Animal {
    private final double averageWeight;
    private final boolean canEatVegetables;

    public Kangaroo(){
        this.averageWeight = 55;
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
