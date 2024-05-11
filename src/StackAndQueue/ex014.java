package StackAndQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ex014 {
    public static void main(String[] args){
        int[] arr = {1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0};
        ArrayList<Integer> list = new ArrayList<>();

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if(first == second){
                return o1 > o2 ? 1 : -1;
            } else{
                return first - second;
            }
        });

        for (int j : arr) {
            if (j == 0) {
                if (myQueue.isEmpty()) {
                    list.add(0);
                } else {
                    list.add(myQueue.poll());
                }
            } else {
                myQueue.add(j);
            }
        }
        for(int i: list){
            System.out.println(i + " ");
        }

    }
}
