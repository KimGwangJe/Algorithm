package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1269 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < M; j++){
            int a = Integer.parseInt(st.nextToken());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int num = 0;
        for(int i : map.keySet()){
            if(map.get(i) == 1) num++;
        }
        System.out.println(num);
    }
}
