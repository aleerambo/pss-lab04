package it.unibo.diet;

public class Herbivore implements Diet {
    public boolean isCarnivore(){
        return false;
    }

    public boolean isHerbivore(){
        return true;
    }
}
