package it.unibo.animal;

public class KoratCat implements Animal{
    private final double averageWeight;
    private final boolean canEatVegetables;

    public KoratCat(){
        this.averageWeight = 4;
        this.canEatVegetables = false;
    }

    public double averageWeight() {
        return this.averageWeight;
    }

    public boolean canEatVegetables() {
        return this.canEatVegetables;
    }

    public boolean canEat(Animal a) {
        return !this.canEatVegetables && a.averageWeight() < this.averageWeight;
    }
}
