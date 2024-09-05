package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split("");
            int left = 0;
            int right = 0;
            for (String s : str) {
                if (right > left) break;
                if (s.equals("(")) left++;
                if (s.equals(")")) right++;
            }
            if(left == right) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
