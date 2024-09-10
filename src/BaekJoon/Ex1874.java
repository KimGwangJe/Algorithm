package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Ex1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        List<String> output = new ArrayList<>(); // 출력을 기록할 리스트
        int nextNum = 1;
        boolean isPossible = true;

        int i = 0;
        while (i < N) {
            if (nextNum <= arr[i]) {
                // nextNum을 target까지 push
                while (nextNum <= arr[i]) {
                    stack.push(nextNum++);
                    output.add("+");
                }
            }

            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                output.add("-");
                i++;
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            for (String op : output) {
                System.out.println(op);
            }
        } else {
            // 불가능한 경우 "NO" 출력
            System.out.println("NO");
        }
    }
}
