package it.unibo;

public class Kangaroo implements Animal {
    private double averageWeight;
    private boolean canEatVegetables;
    private boolean canEat;

    public double averageWeight() {
        return this.averageWeight = 55;
    }

    public boolean canEatVegetables() {
        return this.canEatVegetables = true;
    }

    public boolean canEat(Animal a) {
        return this.canEat = false;
    }
}
