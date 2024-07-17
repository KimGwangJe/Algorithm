package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ex1744 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> up = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> down = new PriorityQueue<>();
        int one = 0;
        int zero = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int q = Integer.parseInt(br.readLine());
            if(q > 1){
                up.add(q);
            } else if(q == 1){
                one++;
            } else if(q == 0){
                zero++;
            } else {
                down.add(q);
            }
        }
        int sum = 0;

        while(up.size() > 1){
            int a = up.remove() * up.remove();
            sum += a;
        }
        if(!up.isEmpty()){
            sum += up.remove();
        }
        while(down.size() > 1){
            sum += down.remove() * down.remove();
        }
        if(!down.isEmpty()){
            if(zero == 0){
                sum += down.remove();
            }
        }
        sum+=one;
        System.out.println(sum);

    }
}
