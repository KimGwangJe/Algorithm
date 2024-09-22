package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] sosu = new boolean[123456 * 2 + 1];
        sosu[0] = true;
        sosu[1] = true;

        for(int i = 2; i <= Math.sqrt(sosu.length); i++){
            for(int j = i * i; j <= sosu.length; j+=i){
                sosu[j] = true;
            }
        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;

            int num = 0;
            for(int i = N+1; i <= N*2; i++){
                if(!sosu[i]) num++;
            }
            bw.write(num + "\n");
        }
        bw.flush();
    }
}
