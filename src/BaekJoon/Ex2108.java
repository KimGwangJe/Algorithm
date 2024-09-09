package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(br.readLine());
            sum+=a;
            arr[i] = a;
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Arrays.sort(arr);

        System.out.println(Math.round((float) sum /N));
        System.out.println(arr[(N-1)/2]);
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) > max){
                maxIndex = i;
                max = map.get(i);
            }
        }
        ArrayList<Integer> most = new ArrayList<>();
        for(Integer i : map.keySet()){
            if(max == map.get(i)){
                most.add(i);
            }
        }
        Collections.sort(most);

        System.out.println(most.size() == 1 ? maxIndex : most.get(1)); // ?
        System.out.println(arr[N-1] - arr[0]);
    }
}
