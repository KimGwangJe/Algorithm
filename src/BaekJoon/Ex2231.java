package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean make = false;

        for(int i = 1; i <= N; i++){
            int sum = i;
            String[] str = String.valueOf(i).split("");
            for(int j = 0 ; j < str.length; j++){
                sum += Integer.parseInt(str[j]);
            }
            if(sum == N) {
                make = true;
                System.out.println(i);
                break;
            }
        }
        if(!make) {
            System.out.println(0);
        }
    }
}
