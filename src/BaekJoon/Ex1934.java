package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1934 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(lcd(a,b));
        }
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcd(int a, int b){
        return a * b / gcd(a,b);
    }
}
