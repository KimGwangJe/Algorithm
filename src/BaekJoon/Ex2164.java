package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.function.DoubleToIntFunction;

public class Ex2164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            que.add(i);
        }

        while(!(que.size() == 1)){
            que.removeFirst();
            int first = que.getFirst();
            que.removeFirst();
            que.addLast(first);
        }
        System.out.println(que.getFirst());
    }
}
