package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex25501 {
    public static int num = 1;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            System.out.println(isPalindrome(s, 0, s.length() - 1) + " " +  num);
            num = 1;
        }
    }

    public static int isPalindrome(String s, int left, int right){
        if(left>right){
            return 1;
        } else if(left == right){
            return 1;
        }
        else if(s.charAt(left) != s.charAt(right)){
            return 0;
        } else {
            num++;
            return isPalindrome(s, left+1, right-1);
        }
    }
}
