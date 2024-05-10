package SlidingWindow;

public class ex010 {
    static int[] arr = {1,5,2,3,6,2,3,7,3,5,2,6};
    static int[] myArr = new int[arr.length];
    static int min = arr[0];
    static int N = 12;
    static int L = 3;
    public static void main(String[] args){
        myArr[0] = min;
        for(int i = 1; i < L; i++){
            if(arr[i] < min) min = arr[i];
            myArr[i] = min;
        }
        for(int i = L; i < N; i++){
            if(arr[i - L] == min){
                min = Math.min(arr[i - L + 1], arr[i - L + 2]);
            }
            add(arr[i]);
            myArr[i] = min;
        }

        for(int i: myArr){
            System.out.println(i);
        }
    }


    public static void add(int a){
        if(a < min) min = a;
    }
}