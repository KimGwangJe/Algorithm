package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum+=arr[j];
                if(sum == m){
                    count++;
                    break;
                } else if(sum > m) break;
            }
        }
        System.out.println(count);
    }
}
