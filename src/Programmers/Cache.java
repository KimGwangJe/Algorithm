package Programmers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Cache {
    public static void main(String[] args){
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    }

    public static int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> que = new LinkedList<>();
        Set<String> set = new HashSet<>();

        String firstStr = cities[0].toLowerCase();
        que.add(firstStr);
        set.add(firstStr);
        int answer = 5;

        for(int i = 1; i < cities.length; i++){
            String str = cities[i].toLowerCase();
            boolean result = set.contains(str);
            if(result){
                que.remove(str);
                que.add(str);
                answer+=1;
            } else {
                if(set.size() >= cacheSize){
                    String a = que.poll();
                    set.remove(a);
                }
                set.add(str);
                que.add(str);
                answer+=5;
            }
        }
        return answer;
    }
}
