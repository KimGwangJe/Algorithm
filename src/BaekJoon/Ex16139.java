package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex16139 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[str.length() + 1][26];

        // arr 배열에 문자별 누적합을 계산
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (str.charAt(i - 1) - 'a' == j) {
                    arr[i][j] = arr[i - 1][j] + 1;
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }

        // 질의에 대한 답 출력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = arr[end + 1][s.charAt(0) - 'a'] - arr[start][s.charAt(0) - 'a'];
            bw.write(String.valueOf(result));
            bw.newLine(); // 개행을 올바르게 처리하기 위해 newLine() 사용
        }

        bw.flush();
    }
}
