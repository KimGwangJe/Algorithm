package StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class ex013 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        int i = 0;
        while(list.size() > 1){
            if(i % 2 == 0) {
                list.remove(0);
            } else{
                int a = list.remove(0);
                list.add(a);
            }
            i++;
        }
        System.out.println(list.get(0));
    }
}
