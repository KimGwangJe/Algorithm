package PrefixSum;

public class ex003 {
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        int[] arr = {5,4,3,2,1};
        int[] sum = new int[arr.length+1]; //a와 b가 인덱스가 아니기때문에 배열을 한칸 더 만듦 0번째 인덱스는 0으로 초기화
        sum[1] = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum[i+1] = sum[i] + arr[i];
        }

        System.out.println(sum[b] - sum[a-1]);
    }
}
