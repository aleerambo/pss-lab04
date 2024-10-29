package it.unibo.qa;

public class Cat {
    private static int numberOfLives = 9;
    public String name; 
    public String color;
    public String breed;
    public int age;

    public Cat(final String name, final String color, final int age, final String breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    /*
      This method is useful because it allows the cat to meow and introduce itself 
      to the world in a single line of code.
     */
    public String Meow() {
        return "Meow, meow, I am " + name + ", hear me purr, In this feline world,"
        + " I'm the star, that's for sure. With whiskers long and fur so sleek, I'm here"
        + " to share my story, so take a peek!";
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int hasSameColor(Cat cat) {
        if (color == cat.color) {
            return 1;
        }else{
            return 0;
        }
    }

    String getName() {
        return this.name;
    }

    String getBreed() {
        return this.breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri","Gray",4, "Korat");
        System.out.println(cat.Meow());
    }
}