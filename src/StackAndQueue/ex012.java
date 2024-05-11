package StackAndQueue;

public class ex012 {
    public static void main(String[] args){
        int[] A = {9,5,4,8};
        int[] myArr = new int[A.length];

        for(int i = 0; i < A.length - 1; i++){
            int j = i + 1;
            while(j<A.length){
                if(A[i] < A[j]){
                    myArr[i] = A[j];
                    break;
                }
                j++;
                if(j==A.length) myArr[i] = -1;
            }
        }
        myArr[A.length-1] = -1;
        for(int i : myArr){
            System.out.print(i+" ");
        }
    }
}
