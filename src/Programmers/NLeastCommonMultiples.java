package Programmers;

public class NLeastCommonMultiples {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public int gcd(int x, int y){
        if (x % y == 0) {
            return y;
        }
        return gcd(y,x%y);
    }

    public int lcm(int x, int y){
        return x * y / gcd(x, y);
    }
}
