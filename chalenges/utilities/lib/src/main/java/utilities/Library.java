/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utilities;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        AnimalShelter animalShelter=new AnimalShelter();
        animalShelter.enQueue(animalShelter);
        animalShelter.enQueue(animalShelter);
        animalShelter.enQueue(animalShelter);
        animalShelter.deQueue();
        System.out.println(animalShelter.peek());
    }
}