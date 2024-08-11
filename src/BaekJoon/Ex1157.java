package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toUpperCase();

        int[] arr = new int[26];

        for(int i = 0; i <str.length(); i++){
            arr[str.charAt(i) - 'A']++;
        }
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);
        if(arr1[arr.length - 2] == arr1[arr.length - 1]) {
            System.out.println("?");
        } else {
            int max = arr1[arr.length - 1];
            for(int i = 0; i < arr.length; i++){
                if(max == arr[i]){
                    System.out.println((char) (i + 'A'));
                }
            }
        }
    }
}
