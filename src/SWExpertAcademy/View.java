package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class View {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] building = new int[N+4];
        for(int i = 2; i < N+2; i++){
            building[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i = 2; i < N+2; i++){
            int left = Math.max(building[i - 2], building[i - 1]);
            int right = Math.max(building[i + 1], building[i + 2]);

            int max = Math.max(left, right);
            if(max < building[i]){
                count += building[i] - max;
            }
        }

        System.out.println(count);
    }
}
