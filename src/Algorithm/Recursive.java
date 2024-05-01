package Algorithm;

public class Recursive {

    public static int factorial(int n) {
        if(n  > 0){
            return n * factorial(n-1);
        } else{
            return 1;
        }
    }

    //--- 재귀 메서드 ---//
    static void recur(int n) {
        if (n > 0) {
            recur(n - 2);
            System.out.println(n);
            recur(n - 1);
        }
    }

    static void recur2(int n){
        while(n>0){
            recur(n - 1);
            System.out.println(n);
            n -= 2;
        }
    }

    public static void main(String[] args){
        recur2(4);
    }
}
