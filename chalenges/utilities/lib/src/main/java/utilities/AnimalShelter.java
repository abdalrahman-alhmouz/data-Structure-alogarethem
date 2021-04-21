package utilities;

import java.util.EmptyStackException;

public class AnimalShelter {

    private Node rear,front;
    int size =0;

    public boolean isEmbty(){
        return size==0;
    }

    public void enQueue(AnimalShelter num){
        Cat cat =new Cat();
        cat.setCats("cats");
        Dogs dogs =new Dogs();
        dogs.setDogs("dogs");
        Node temb=new Node(cat.getCats());
        Node tembTow=new Node(dogs.getDogs());
        if (size%2==0){
            if(front==null){
                rear=tembTow;
                front=tembTow;
                size++;
            }else {
                rear.next=tembTow;
                rear=tembTow;
                size++;
            }
        }else{
            if(front==null){
                rear=temb;
                front=temb;
                size++;
            }else {
                rear.next=temb;
                rear=temb;
                size++;
            }
        }


    }
      public void deQueue(){
        Node response=null;
        if (front!=null){
            if (front.next!=null){
                response=new Node(front.value);
                front=front.next;
                size--;
            }else {
                response=null;
                front=null;
                size--;
            }
        }else {
            throw new EmptyStackException();

        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "rear=" + rear.value +
                ", front=" + front.value +
                ", size=" + size +
                '}';
    }
    public String peek(){
        if (!isEmbty())
            return front.value;
        else
            throw new EmptyStackException();
    }
    //String cats,dogs;
//
//    public AnimalShelter(String cats, String dogs) {
//        this.cats = cats;
//        this.dogs = dogs;
//    }
//
//    public String getCats() {
//        return cats;
//    }
//
//    public void setCats(String cats) {
//        this.cats = cats;
//    }
//
//    public String getDogs() {
//        return dogs;
//    }
//
//    public void setDogs(String dogs) {
//        this.dogs = dogs;
//    }
}
