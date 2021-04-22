package utilities;

public class Animal {
    public Animal(String animal,String color, int age) {
        this.color = color;
        this.age = age;
        this.animal = animal;
    }

    private String color,animal ;
    int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + animal + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
