package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            map.put(br.readLine(), 1);
        }

        for(int i = 0; i < M; i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            if(map.get(str) == 2){
                list.add(str);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
