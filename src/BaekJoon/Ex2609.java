package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        System.out.println(min(N, M));
        System.out.println(max(N, M));
    }

    public static int min(int a, int b){
        if(b == 0){
            return a;
        } else {
            return min(b, a % b);
        }
    }

    public static int max(int a, int b){
        return (a*b)/min(a,b);
    }
}
