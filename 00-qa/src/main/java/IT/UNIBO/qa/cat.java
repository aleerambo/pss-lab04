package IT.UNIBO.qa;

public class Cat {
    public static int numberOfLives = 9;
    public String Name; 
    public String Color;
    public String Breed;
    public int Age;

    public Cat(final String Name, final String Color, final int Age, final String Breed) {
        this.Name = Name;
        this.Color = Color;
        this.Age = Age;
        this.Breed = Breed;
    }

    /*
      This method is useful because it allows the cat to meow and introduce itself 
      to the world in a single line of code.
     */
    public String Meow() {
        return "Meow, meow, I am " + Name + ", hear me purr, In this feline world," +
        " I'm the star, that's for sure. With whiskers long and fur so sleek, I'm here" +
        " to share my story, so take a peek!";
    }
    
    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return this.Color;
    }

    public int hasSameColor(Cat cat) {
        if (Color == cat.Color) {
            return 1;
        }else{
            return 0;
        }
    }

    String getName() {
        return this.Name;
    }

    String getBreed() {
        return this.Breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri","Gray",4, "Korat");
        System.out.println(cat.Meow());
    }
}