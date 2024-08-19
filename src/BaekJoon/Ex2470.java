package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex2470 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);
        int l = 0;
        int r = N - 1;
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;

        while(l < r){
            int sum = arr.get(l)+arr.get(r);
            if(min> Math.abs(sum)){
                min = Math.abs(sum);

                res[0] = arr.get(l);
                res[1] = arr.get(r);

                if(sum==0) break;
            }
            if(sum <0) l++;
            else r--;
        }

        System.out.println(res[0]+" "+res[1]);
    }
}
