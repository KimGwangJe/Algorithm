package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex12789 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int i = 1;

        for(int j = 0; j < N; j++){
            deque.offer(Integer.parseInt(st.nextToken()));
        }

        while(!deque.isEmpty()){
            if(deque.peek() == i){
                deque.poll();
                i++;
            } else if(!stack.isEmpty() && stack.peek() == i){
                stack.pop();
                i++;
            } else {
                stack.push(deque.poll());
            }
        }

        boolean isSuccess = true;

        while (!stack.isEmpty()) {
            if (stack.peek() == i) {
                stack.pop();
                i++;
            } else {
                isSuccess = false;
                break;
            }
        }
        System.out.println(isSuccess ? "Nice" : "Sad");
    }
}
