package Algorithm.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ex5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            boolean front = true;
            boolean error = false;
            String[] s = br.readLine().split("");
            Deque<Integer> arr = new ArrayDeque<>();
            int num = Integer.parseInt(br.readLine());
            for(int j = 0; j < num; j++){
                arr.addLast(Integer.parseInt(br.readLine()));
            }
            for (String string : s) {
                if (string.equals("R")) {
                    front = !front; //반대로 돌려야됨
                } else {
                    try {
                        if (front) {
                            arr.removeFirst();
                        } else {
                            arr.removeLast();
                        }
                    } catch (Exception e) {
                        error = true;
                    }
                }
            }
            if(error){
                System.out.println("Error");
            } else{
                while (!arr.isEmpty()) {
                    if (front) {
                        System.out.println(arr.removeFirst());
                    } else {
                        System.out.println(arr.removeLast());
                    }
                }
            }
        }
    }
}
