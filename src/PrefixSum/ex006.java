package PrefixSum;

public class ex006 {
    public static int P2018(){
        int N = 15;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum += end_index;
            } else if(sum > N){
                sum -= start_index;
                start_index++;
            } else{
                end_index++;
                sum += end_index;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 15;
        int result = 1;
        for(int i = 1; i <= n/2; i++){
            int sum = i;
            int a = i+1;
            while(a < n){
                sum+=a;
                a++;
                if(sum == n){
                    result++;
                }
            }
        }
        System.out.println(result);
        System.out.println(P2018());
    }
}