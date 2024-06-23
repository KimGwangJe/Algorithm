package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        while (left != N - 1 && right <= N - 1) {
            if (left == right) {
                if (arr[left] == N) {
                    sum++;
                    left++;
                    right++;
                }
            }
            if (arr[right] - arr[left] == N) {
                sum++;
                left++;
            } else if (arr[right] - arr[left] > N) {
                left++;
            } else {
                right++;
            }
        }
        System.out.println(sum);
    }
}
