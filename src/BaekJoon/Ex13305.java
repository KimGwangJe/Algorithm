package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex13305 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] length = new long[N-1];
        for(int i=0;i<N-1;i++){
            length[i] = Long.parseLong(st.nextToken());
        }
        long[] oil = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            oil[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        int oilIndex = 0;
        int lengthIndex = 0;
        for(int i = 0; i < N-1; i++){
            if(oil[oilIndex] <= oil[i]){
                sum += oil[oilIndex] * length[lengthIndex++];
            } else{
                oilIndex = i;
                sum += oil[oilIndex] * length[lengthIndex++];
            }
        }
        System.out.println(sum);

    }
}
