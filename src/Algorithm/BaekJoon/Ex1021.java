package Algorithm.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
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

        Deque<Integer> temp = new ArrayDeque<>();
        for(int i = 1; i < N+1; i++){
            temp.addLast(i);
        }
        int answer = 0;
        for(int i = 0; i < M; i++){
            int target = arr[i];
            int leftShift = 0;
            while(temp.peekFirst() != target){
                int num = temp.removeFirst();
                temp.addLast(num);
                leftShift++;
            }
            int rightShift = temp.size() - leftShift;
            answer+=Math.min(leftShift, rightShift);
            temp.removeFirst();
        }
        System.out.println(answer);

    }
}
