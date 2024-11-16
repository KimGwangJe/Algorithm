package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinSum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int test = 1; test <= N; test++){
            String str = br.readLine();
            int min = Integer.MAX_VALUE;

            for(int i = 1; i < str.length(); i++){
                int left = Integer.parseInt(str.substring(0, i));
                int right = Integer.parseInt(str.substring(i));
                if(right + left < min){
                    min = right + left;
                }
            }
            sb.append("#").append(test).append(" ").append(min).append("\n");
        }
        System.out.println(sb.toString());
    }
}
