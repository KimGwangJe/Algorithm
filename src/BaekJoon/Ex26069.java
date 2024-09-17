package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex26069 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();
        map.put("ChongChong", true);
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(!map.containsKey(a)){
                map.put(a, false);
            }
            if(!map.containsKey(b)){
                map.put(b, false);
            }
            if(map.get(a)){
                map.put(b, true);
            }
            if(map.get(b)){
                map.put(a, true);
            }
        }
        int count = 0;
        for(String s : map.keySet()){
            if(map.get(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
