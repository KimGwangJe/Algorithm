package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1018 {
    public static void main(String[] args) throws Exception {
        String[][] B = {
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
        };

        String[][] W = {
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] temp = new String[N][M];
        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            temp[i] = s;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int b = 0;
                int w = 0;

                for(int k = i; k < i + 8; k++){
                    for(int l = j; l < j + 8; l++){
                        if(!temp[k][l].equals(B[k-i][l-j])){
                            b++;
                        }
                        if(!temp[k][l].equals(W[k-i][l-j])){
                            w++;
                        }
                    }
                }
                min = Math.min(Math.min(b, w), min);
            }
        }

        System.out.println(min);
    }
}