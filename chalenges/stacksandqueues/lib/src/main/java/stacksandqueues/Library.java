/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksandqueues;

public class Library {
    public static void main(String[] args) {
        Stack stack=new Stack();
        Queue queue=new Queue();
        PseudoQueue pseudoQueue=new PseudoQueue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);

        stack.push(5 );
        stack.push(6);
        stack.push(68);
        stack.pop();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(7);
        pseudoQueue.enqueue(8);
        pseudoQueue.enqueue(9);
        pseudoQueue.dequeue();
//        System.out.println(pseudoQueue.deQueue());
//            pseudoQueue.dequeue(pseudoQueue.);
        System.out.println(pseudoQueue.dequeue());
        String[] array={"D","f","o","q","m"};
        System.out.println(queue.DuckDuckGoose(array,2));



    }}
