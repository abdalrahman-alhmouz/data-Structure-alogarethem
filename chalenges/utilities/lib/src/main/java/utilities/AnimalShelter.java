package utilities;

import java.util.EmptyStackException;

public class AnimalShelter {
    private int size=0;
    private Node rear,front;
    Queue catey=new Queue();
    Queue dogy=new Queue();


    public boolean isEmbty(){
        return size==0;
    }

    public void enQueue(Animal animal){
        try {
            if(animal instanceof Cat) {
                catey.enQueue(animal);
                System.out.println(catey.peek());

            }else if(animal instanceof Dogs)
                dogy.enQueue(animal);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public Object dequeue(String pref){
        try {
            if (pref.toLowerCase() == "cat"){
                if (catey.isEmbty())
                    return new NullPointerException();
                return  catey.deQueue();
            }else if (pref.toLowerCase() == "dog"){
                if (dogy.isEmbty())
                    return new NullPointerException();
                return dogy.deQueue();
            }
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return null;
    }

//    @Override
//    public String toString() {
//        return "AnimalShelter{" +
//                " catey=" + catey +
//                ", dogy=" + dogy +
//                '}';
//    }


    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catey=" + catey.toString() +
                ", dogy=" + dogy.toString() +
                '}';
    }

    public Queue getCatey() {
        return catey;
    }

    public void setCatey(Queue catey) {
        this.catey = catey;
    }

    public Queue getDogy() {
        return dogy;
    }

    public void setDogy(Queue dogy) {
        this.dogy = dogy;
    }

    public Animal peek(){
        if (!isEmbty())
            return front.value;
        else
            throw new EmptyStackException();
    }

}
