package utilities;

public class Dogs extends Animal{
  String dogs;

    public Dogs(String animal, String color, int age) {
        super(animal, color, age);
    }



    public String getDogs() {
        return dogs;
    }

    public void setDogs(String dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Dog: "+ super.toString();
    }
}
