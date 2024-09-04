package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int a = 0;
        for(int i = 0; i < N; i++){
            int b = Integer.parseInt(br.readLine());
            if(b == 0){
                a-=stack.pop();
            } else {
                a+=b;
                stack.push(b);
            }
        }
        System.out.println(a);
    }
}
