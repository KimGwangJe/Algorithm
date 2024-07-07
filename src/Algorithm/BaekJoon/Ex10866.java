package Algorithm.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ex10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> arr =new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            String[] st = br.readLine().split(" ");
            switch(st[0]){
                case "push_front":
                    arr.addFirst(Integer.parseInt(st[1]));
                    break;
                case "push_back":
                    arr.addLast(Integer.parseInt(st[1]));
                    break;
                case "pop_front":
                    try{
                        System.out.println(arr.removeFirst());
                    } catch(Exception e){
                        System.out.println("-1");
                    }
                    break;
                case "pop_back":
                    try{
                        System.out.println(arr.removeLast());
                    } catch(Exception e){
                        System.out.println("-1");
                    }
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "empty":
                    System.out.println(arr.isEmpty());
                    break;
                case "front":
                    System.out.println(arr.peekFirst());
                    break;
                case "back":
                    System.out.println(arr.peekLast());
                    break;
            }
        }
    }
}
