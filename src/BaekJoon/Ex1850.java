package BaekJoon;

import java.util.Scanner;

public class Ex1850 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = gcd(b,a);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < c; i++){
            sb.append("1");
        }
        System.out.println(sb.toString());
    }

    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
