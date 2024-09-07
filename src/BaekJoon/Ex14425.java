package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            map.put(br.readLine(), 0);
        }
        int num = 0;
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
                num++;
            }
        }
        System.out.println(num);
    }
}
