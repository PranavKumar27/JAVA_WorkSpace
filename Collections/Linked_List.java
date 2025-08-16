import java.util.*;

class Linked_List
{
    public static void main(String args[])
    {
        LinkedList<Integer> L1 = new LinkedList<>();

        LinkedList<Integer> L2 = new LinkedList<>(new LinkedList<>(List.of(50,60,70,80,90)));

        L1.add(12);
        L1.addAll(new LinkedList<Integer>(List.of(18,19,21,23)));
        L1.add(0, -10);


        L2.addFirst(1000);
        L2.addLast(5000);



        System.out.println("\nUsing for each Lambda L1 --> ");
        L1.forEach(n->System.out.print(n + "  "));

        System.out.println("\nUsing for each Lambda  L2 --> ");
        L2.forEach(n->System.out.print(n + "  "));


        System.out.println("\nL2.get(4); --> " + L2.get(4));

        System.out.println("\nL2.peek() --> " + L2.peek());
        System.out.println("\n L2.peekLast() --> " +  L2.peekLast());

        System.out.println("\nUsing for each Lambda L1 --> ");
        L1.forEach(n->System.out.print(n + "  "));

        System.out.println("\nUsing for each Lambda  L2 --> ");
        L2.forEach(n->System.out.print(n + "  "));

    }
}