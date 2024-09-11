package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[M]; //찾을 숫자
        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            deque.addLast(i);
        }

        int answer = 0;
        for(int i = 0; i < M; i++){
            int targetIndex = deque.indexOf(arr[i]);
            int half;

            if(deque.size() % 2 == 0){
                half = deque.size() / 2 - 1;
            } else {
                half = deque.size() / 2;
            }

            if(targetIndex <= half){
                for(int j = 0; j < targetIndex; j++){
                    deque.offerLast(deque.pollFirst());
                    answer++;
                }
            } else{
                for(int j = 0; j < deque.size() - targetIndex; j++){
                    deque.offerFirst(deque.pollLast());
                    answer++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(answer);
    }
}
