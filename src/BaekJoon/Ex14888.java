package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex14888 {

    public static int Max = Integer.MIN_VALUE;
    public static int Min = Integer.MAX_VALUE;
    public static int[] arr;
    public static int[] operation = new int[4];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //수
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 연산
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            operation[i] = Integer.parseInt(st.nextToken());
        }

        DFS(arr[0],1);
        System.out.println(Max);
        System.out.println(Min);
    }

    public static void DFS(int num, int idx){
        if(idx == arr.length){
            Max = Math.max(Max, num);
            Min = Math.min(Min, num);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(operation[i] > 0){
                operation[i]--;

                switch(i){
                    case 0:
                        DFS(num+arr[idx],idx+1);
                        break;
                    case 1:
                        DFS(num-arr[idx],idx+1);
                        break;
                    case 2:
                        DFS(num*arr[idx],idx+1);
                        break;
                    case 3:
                        DFS(num/arr[idx],idx+1);
                        break;
                }
                operation[i]++;
            }
        }
    }
}
