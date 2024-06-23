package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IsPrime {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(isPrime(N));
        boolean[] arr = new boolean[N+1];
        Arrays.fill(arr, true);
        isPrime(arr,N);
        for (int i = 2; i <= N; i++) {
            if(arr[i]){
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int n) {
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void isPrime(boolean[] arr, int n){
        for(int i = 2; i <= n / 2; i++){
            if(arr[i]){
                for(int j = i * 2; j <= n; j+=i){
                    arr[j] = false;
                }
            }
        }
    }
}
