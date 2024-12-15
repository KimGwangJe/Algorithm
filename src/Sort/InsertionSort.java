package Sort;

public class InsertionSort {
    public static int[] arr = {6,8,2,1,3,7};
    public static void main(String[] args){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            for(j = i - 1; j >= 0; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                } else{
                    break;
                }
            }
            arr[j+1] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
