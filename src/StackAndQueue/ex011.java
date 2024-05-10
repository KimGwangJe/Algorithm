package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class ex011 {
    static int N = 8;
    static int[] arr = {4,3,6,8,7,5,2,1};
    static boolean result = true;
    static Stack<Integer> stack = new Stack<>();
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args){
        int num = 1; // 넣을 수
        for(int i = 0; i < N; i++){
            int su = arr[i];
            if(num < su){
                while(su >= num){
                    stack.push(num++);
                    list.add("+");
                }
                stack.pop();
                list.add("-");
            } else{ // 5를 뺼 차례인데 5 또는 4임
                int n = stack.pop(); // 맨 위 데이터
                if(su < n){
                    System.out.println("No");
                    result = false;
                    break;
                } else {
                    list.add("-");
                }
            }
        }
        if(result){
            for(String s: list){
                System.out.println(s);
            }
        }
    }
}
