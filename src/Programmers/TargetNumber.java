package Programmers;

public class TargetNumber {

    public static int result = 0;
    public static int T = 0;

    public static void main(String[] args){
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        int depth = 0;
        T = target;
        DFS(numbers, depth, 0);
        System.out.println(result);
    }

    public static void DFS(int[] arr, int depth, int num){
        if(depth == arr.length && num == T){
            result++;
            return;
        } else if (depth == arr.length){
            return;
        }
        DFS(arr, depth+1, num+arr[depth]);
        DFS(arr, depth+1, num-arr[depth]);
    }
}
