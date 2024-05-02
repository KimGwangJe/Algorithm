package Algorithm.Sort;

public class CountingSort {

    public static void countingSort(int[] arr, int nx, int max){
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[nx];
        for(int i = 0; i < nx; i++) f[arr[i]]++;
        for(int i = 1; i <= max; i++) f[i] += f[i - 1];
        for(int i = nx - 1; i >=0; i--) b[--f[arr[i]]] = arr[i];
        for(int i = 0; i < nx; i++) arr[i] = b[i];
    }

    public static void main(String[] args){
        int[] arr = {22,5,11,32,120,68,70};
        int max = 0;
        for(int i: arr){
            if(max < i) max = i;
        }
        countingSort(arr, arr.length, max);
        for(int i: arr) System.out.println(i);
    }
}
