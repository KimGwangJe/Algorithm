package Programmers;

import java.util.HashMap;

public class Clothes {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for(String s: map.keySet()){
            answer *= map.get(s)+1;
        }

        return --answer;
    }

    public static void main(String[] args){
        solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }
}
