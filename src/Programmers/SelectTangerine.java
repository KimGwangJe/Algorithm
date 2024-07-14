package Programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SelectTangerine {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i: tangerine){
                map.put(i, map.getOrDefault(i,0) + 1);
            }

            PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
            for(Integer i: map.values()){
                que.add(i);
            }

            while(k>0){
                k-=que.remove();
                answer++;
            }
            return answer;
    }
}
