// package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ {
    /**
     * @param args
     */
    public static void main(String args[]) {
        ArrayList<Integer> Arr1 = new ArrayList<>(30);

        Arr1.add(10);
        Arr1.add(1, 20);

        ArrayList<Integer> Ar2 = new ArrayList<>(List.of(90, 82, 7, 60));
        Ar2.add(30);
        Ar2.add(2, 45);

        Arr1.addAll(Ar2);

        System.out.println("Arr1 = " + Arr1);
        System.out.println("Ar2 = " + Ar2);

        // Arr1.removeAll(Ar2);

        ArrayList<Integer> Arr3 = new ArrayList<>(List.of(55, 66, 77, 88));
        Arr1.addAll(5, Arr3);

        System.out.println("Arr1 = " + Arr1);

        @SuppressWarnings("unchecked")
        Object ob = Arr1.clone();
        System.out.println((ArrayList<Integer>) ob);

        System.out.println("Is 100 present in Arr1 = " + Arr1.contains(100));

        System.out.println("Get Value at index 6 = " + Arr1.get(6));

        System.out.println("Index Of value = 70 : " + Arr1.indexOf(70));

        System.out.println("Index Of value = 77 : " + Arr1.indexOf(77));

        Arr1.add(10, 77);

        System.out.println("Arr1 = " + Arr1);

        System.out.println("Last Index Of value = 77 : " + Arr1.lastIndexOf(77));

        Arr1.removeAll(Ar2);

        System.out.println("Arr1 = " + Arr1);

        Arr1.set(3,105);

        System.out.println("After Using Array.set = "+Arr1);

        // Iterating through ArrayList
        System.out.println("Using for Loop --> ");
        for(int i=0;i<Arr1.size();i++)
        {
            System.out.print(Arr1.get(i)+ "  ");
        }

        //Arr1.retainAll(new ArrayList<Integer>(List.of(20,30,105)));
        System.out.println("\nUsing for-each Loop --> ");
        for(var x:Arr1)
        {
            System.out.print(x + "  ");
        }

        System.out.println("\nUsing iterator while loop --> ");
        Iterator<Integer> it = Arr1.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next() + " , ");
        }

        System.out.println("\nUsing ListIterator while loop --> ");
        ListIterator<Integer> Litr = Arr1.listIterator();

        while(Litr.hasNext())
        {
            System.out.print(Litr.next() + " , ");
        }

        // Using for loop instead of while
        System.out.println("\nUsing for loop instead of while --> ");
        for(ListIterator<Integer> ltr = Ar2.listIterator(); ltr.hasNext();)
        {
            System.out.print(ltr.next() + " , ");
        }

        System.out.println("\nUsing for each Lambda Technique 1 --> ");
        Ar2.forEach(n->System.out.print(n + " . "));

        System.out.println("\nUsing for each Lambda Technique 2 --> ");
        Arr1.forEach(n->PrintGreaterThan60(n));
    }

    static void PrintGreaterThan60(int n)
    {
        if(n>60)
            System.out.print(n  + " . ");
    }
}
