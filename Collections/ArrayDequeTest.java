package Collections;
import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
       ArrayDeque<Integer> dq = new ArrayDeque<>();

       // Using dq as Stack
       dq.addLast(5);
       dq.offerLast(10);
       dq.addLast(15);
       dq.offerLast(25);

       System.out.println("Stack -->");
       dq.forEach((n)->System.out.println(n+" "));

       dq.removeLast(); // throws Exception
       System.out.println("top = "+dq.peekLast());

       dq.pollLast();
       System.out.println("top = "+dq.peekLast());

       // Implementing Queue
       ArrayDeque<Integer> q = new ArrayDeque<>();

       q.addLast(10);
       q.offerLast(20);
       q.addLast(30);
       q.offerLast(40);

       System.out.println("Queue -->");
       q.forEach((y)->System.out.print(y+" "));

       System.out.println("");

       Integer v = q.pollFirst();

       System.out.println("Last of Queue = " +v);


       v = q.removeFirst();

       System.out.println("Last of Queue = " +v);

    }
}
