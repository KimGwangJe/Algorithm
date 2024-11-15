package Programmers;

import java.util.HashMap;
import java.util.Map;

public class RollCake {
    public static void main(String[] args){
        solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
    }

    public static int solution(int[] topping) {
        int result = 0;

        Map<Integer,Integer> ob = new HashMap<>();
        Map<Integer,Integer> yb = new HashMap<>();

        for(int i : topping){
            ob.put(i, ob.getOrDefault(i, 0) + 1);
        }

        for(int i : topping){
            yb.put(i, ob.getOrDefault(i, 0) + 1);

            if(ob.get(i) - 1 == 0){
                ob.remove(i);
            } else {
                ob.put(i, ob.get(i) - 1);
            }
            if(ob.size() == yb.size()) result++;
        }

        return result;
    }
}
