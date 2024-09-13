package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2885 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 1; //덩어리 갯수
        while(i < N){
            i*=2;
        }

        int split = 0; //쪼갠 횟수
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" ");
        while(N>0){
            if(N>=i){
                N-=i;
            }else{
                i/=2;
                split++;
            }
        }
        sb.append(split);
        System.out.println(sb);
    }
}
