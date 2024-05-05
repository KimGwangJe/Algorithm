package PrefixSum;

public class ex004 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
        int sum = 0;
        int[] a = {1,1};
        int[] b = {2,3};

        for(int i = a[1]; i <= b[1]; i++){
            for(int j = a[0]; j <= b[0]; j++){
                sum+=arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
