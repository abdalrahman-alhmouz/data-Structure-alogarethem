package stacksandqueues;

import java.util.EmptyStackException;

public class Stack{
   private Node top=null;
    int size =0;

    public void push(int num){
    Node temb=new Node(num);
    temb.next=top;
    top=temb;
    size++;

    }

    public int pop(){
    if (isEmpty())
        throw new EmptyStackException();
    int result=top.value;
    top=top.next;
    size--;

        return result;
    }
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
return top.value;
}
    public int size(){
    return size;
    }
    public boolean isEmpty(){
    return size==0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top.value +
                ", size=" + size +
                '}';
    }
}
