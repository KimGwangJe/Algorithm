package Search;

public class LinearSearch {
    public static int[] arr = {4,-1,2,3,1,7};
    public static void main(String[] args){
        int targetNum = 1;
        for(int i = 0; i < arr.length; i++){
            if(targetNum == arr[i]){
                System.out.println("TargetNum Index = " + i);
            }
        }

    }
}
