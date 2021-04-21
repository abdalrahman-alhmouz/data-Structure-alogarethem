/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void pushStack() {
        Stack stack=new Stack();
        assertTrue("true",stack.isEmpty());
        stack.push(5);
        assertFalse("false",stack.isEmpty());
    }
    @Test public void pushStackMulti() {
        Stack stack=new Stack();
        assertTrue("true",stack.isEmpty());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertFalse("false",stack.isEmpty());

    }
    @Test public void popStack() {
        Stack stack=new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peek());
        stack.pop();
        assertEquals(6, stack.peek());


    }
    @Test public void popStackMultiy() {
        Stack stack=new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue("true",stack.isEmpty());
    }
    @Test public void peekStack() {
        Stack stack=new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peek());
    }

    @Test public void instance() {
        Stack stack=new Stack();
        assertTrue("false", stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void stackException() {
        Stack stack=new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(EmptyStackException.class,stack.peek());



    }
    @Test public void enQueueTest() {
        Queue queue=new Queue();
        assertTrue("true",queue.isEmbty());
        queue.enQueue(5);
        assertFalse("false",queue.isEmbty());
    }
    @Test public void enQueueMulti() {
        Queue queue=new Queue();
        assertTrue("true",queue.isEmbty());
        queue.enQueue(5);
        queue.enQueue(5);
        queue.enQueue(5);
        assertFalse("false",queue.isEmbty());

    }
    @Test public void deQueue() {
        Queue queue=new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        assertEquals(5, queue.peek());
        queue.deQueue();
        assertEquals(6, queue.peek());


    }
    @Test public void peekQueue() {
        Queue queue=new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        assertEquals(5, queue.peek());
    }
    @Test public void deQueueMulti() {
        Queue queue=new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        assertEquals(5, queue.peek());
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        assertTrue("true",queue.isEmbty());


    }
    @Test(expected = EmptyStackException.class)
    public void QueueException() {
        Queue queue=new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        assertEquals(EmptyStackException.class,queue.peek());



    }
    @Test public void instanceQuee() {
        Queue queue=new Queue();
        assertTrue("false", queue.isEmbty());
    }
//    _______________________________________________{{{codeChaleng11}}}
@Test public void puseduTest(){
    PseudoQueue pseudoQueue=new PseudoQueue();

    pseudoQueue.enqueue(5);
    pseudoQueue.enqueue(7);
    pseudoQueue.enqueue(8);
    pseudoQueue.enqueue(9);
    System.out.println(pseudoQueue);
    assertEquals(5,pseudoQueue.dequeue());
    assertEquals(7,pseudoQueue.dequeue());
    assertEquals(8,pseudoQueue.dequeue());
    assertEquals(9,pseudoQueue.dequeue());

}

    @Test public void pusedoTesto(){
        PseudoQueue pseudoQueue=new PseudoQueue();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(7);
        pseudoQueue.enqueue(8);
        pseudoQueue.enqueue(9);
        System.out.println(pseudoQueue.toString());
        assertEquals("PseudoQueue{ size=4, inbox=4, outbox=0}",pseudoQueue.toString());

    }

    @Test public void enTest(){
        PseudoQueue pseudoQueue=new PseudoQueue();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(7);
        pseudoQueue.enqueue(8);
        pseudoQueue.enqueue(9);
        pseudoQueue.dequeue();

        assertEquals("PseudoQueue{ size=3, inbox=0, outbox=3}",pseudoQueue.toString());

    }
//    _______________________________________________{{{codeChaleng11}}}

}

