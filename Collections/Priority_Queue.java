// package Collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.*;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer I1,Integer I2)
    {
        if(I1>I2)
            return 1;
        else
            return 0;
    }
}

public class Priority_Queue {

    static void insertingDataInPQ(PriorityQueue<Integer> PQ,Integer Arr[])
    {
        for(Integer x:Arr)
        {
            PQ.add(x);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq_min = new PriorityQueue<>(); // Min Priority Que

        PriorityQueue<Integer> pq_max = new PriorityQueue<>(new MyComp());

        Integer Arr[] = {30,10,20,50,15,3,9};

        System.out.println("\nMin Priority Queue");
        insertingDataInPQ(pq_min,Arr);

        pq_min.forEach((x)->System.out.print(x + " "));

        
        System.out.println("\nMax Priority Queue");
        insertingDataInPQ(pq_max,Arr);

        pq_max.forEach((x)->System.out.print(x+ " "));

    }
}
