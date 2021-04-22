package utilities;

import java.util.EmptyStackException;

public class Queue {
    private Node rear,front;
    int size =0;

    public boolean isEmbty(){
        return size==0;
    }

    public void enQueue(Animal num){
        Node temb=new Node(num);
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
    public Object deQueue(){
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
        return null;
    }
    public Animal peek(){
        if (!isEmbty())
            return front.value;
        else
            throw new EmptyStackException();
    }

}

