package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1747 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ////이부분에서 문제가 좀 있었음 사이즈 조절을 잘해야됨 N의 최대값으로 잡으면 안됐어
        boolean[] prime = new boolean[10000001];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        //소수 판별
        for(int i = 2; i <Math.sqrt(prime.length); i++){
            if(!prime[i]){
              continue;
            }
            for(int j = i + i; j < prime.length; j+=i){
                prime[j] = false;
            }
        }
        for(int i = N; i < prime.length; i++){
            if(prime[i]){
                if(palindrome(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean palindrome(int n){
        String[] str = String.valueOf(n).split("");
        int left = 0;
        int right = str.length - 1;
        while(left < right){
            if(!str[left++].equals(str[right--])){
                return false;
            }
        }
        return true;
    }
}
