package utilities;

public class Cat extends Animal{
String cats ;
    public Cat(String animal, String color, int age) {
        super(animal, color, age);
    }

    public String getCats() {
        return cats;
    }

    public void setCats(String cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Cats: "+ super.toString();
    }
}
