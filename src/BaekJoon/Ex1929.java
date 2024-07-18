package BaekJoon;

import java.util.Scanner;

public class Ex1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        for (int p = 2; p <= Math.sqrt(N); p++) {
            if (prime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}
