package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3273 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;

        int num = 0;

        while(l < r){
            if(arr[l] + arr[r] == X){
                l++;
                r--;
                num++;
            } else if(arr[l] + arr[r] > X){
                r--;
            } else {
                l++;
            }
        }
        System.out.println(num);
    }
}
