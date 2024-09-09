package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex25192 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        int num = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                map = new HashMap<>();
                continue;
            }
            if(!map.containsKey(str)){
                map.put(str,1);
                num++;
            }
        }
        System.out.println(num);
    }
}
